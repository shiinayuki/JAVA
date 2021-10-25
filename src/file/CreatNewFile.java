package file;
/*this program write by Shiina at 2021/6/9/12:38*/

import java.io.*;

public class CreatNewFile {

    private static String path = "D:/Demo/";
    private static String filenameTemp;

    public static void main(String[] args) throws IOException {
        {
            try
            {
                //使用FileReader和FileWriter进行文件复制（操作的是字符）
                FileReader fr=new FileReader("D:/Demo/file1.txt");
                FileWriter fw=new FileWriter("D:/Demo/file2.txt");
                int read;
                //byte b[]=new byte[1024];
                read=fr.read();
                while(read!=-1)
                {
                    fw.write(read);
                    //read=fis.read(b);
                    read=fr.read();
                }
                fr.close();
                fw.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        CreatNewFile.creatTxtFile("file2");
        CreatNewFile.writeTxtFile("042040415");
        CreatNewFile.writeTxtFile("欧阳孜润");
    }

    /**
     * 创建文件
     *
     * @throws IOException
     */
    public static boolean creatTxtFile(String name) throws IOException {
        boolean flag = false;
        filenameTemp = path + name + ".txt";
        File filename = new File(filenameTemp);
        if (!filename.exists()) {
            filename.createNewFile();
            flag = true;
        }
        return flag;
    }

    /**
     * 写文件
     *
     * @param newStr
     *            新内容
     * @throws IOException
     */
    public static boolean writeTxtFile(String newStr) throws IOException {
        // 先读取原有文件内容，然后进行写入操作
        boolean flag = false;
        String filein = newStr + "\r\n";
        String temp = "";

        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        FileOutputStream fos = null;
        PrintWriter pw = null;
        
        try {
            //从文件file1读取东西并输出
            String encoding = "GBK"; // 字符编码(可解决中文乱码问题 )
            File file1 = new File("D:/Demo/file1.txt");
            if (file1.isFile() && file1.exists()) {
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file1), encoding);
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTXT = null;
                while ((lineTXT = bufferedReader.readLine()) != null) {
                    System.out.println(lineTXT.toString().trim());
                }
                read.close();
            } else {
                System.out.println("找不到指定的文件！");
            }

            // 文件路径
            File file2 = new File(filenameTemp);
            // 将文件读入输入流
            fis = new FileInputStream(file2);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            StringBuffer buf = new StringBuffer();

            // 保存该文件原有的内容
            for (int j = 1; (temp = br.readLine()) != null; j++) {
                buf = buf.append(temp);
                // System.getProperty("line.separator")
                // 行与行之间的分隔符 相当于“\n”
                buf = buf.append(System.getProperty("line.separator"));
            }
            buf.append(filein);

            fos = new FileOutputStream(file2);
            pw = new PrintWriter(fos);
            pw.write(buf.toString().toCharArray());
            pw.flush();
            flag = true;
        } catch (IOException e1) {
            // TODO 自动生成 catch 块
            throw e1;
        } finally {
            if (pw != null) {
                pw.close();
            }
            if (fos != null) {
                fos.close();
            }
            if (br != null) {
                br.close();
            }
            if (isr != null) {
                isr.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
        return flag;
    }

}
