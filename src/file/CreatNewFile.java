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
                //ʹ��FileReader��FileWriter�����ļ����ƣ����������ַ���
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
        CreatNewFile.writeTxtFile("ŷ������");
    }

    /**
     * �����ļ�
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
     * д�ļ�
     *
     * @param newStr
     *            ������
     * @throws IOException
     */
    public static boolean writeTxtFile(String newStr) throws IOException {
        // �ȶ�ȡԭ���ļ����ݣ�Ȼ�����д�����
        boolean flag = false;
        String filein = newStr + "\r\n";
        String temp = "";

        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        FileOutputStream fos = null;
        PrintWriter pw = null;
        
        try {
            //���ļ�file1��ȡ���������
            String encoding = "GBK"; // �ַ�����(�ɽ�������������� )
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
                System.out.println("�Ҳ���ָ�����ļ���");
            }

            // �ļ�·��
            File file2 = new File(filenameTemp);
            // ���ļ�����������
            fis = new FileInputStream(file2);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            StringBuffer buf = new StringBuffer();

            // ������ļ�ԭ�е�����
            for (int j = 1; (temp = br.readLine()) != null; j++) {
                buf = buf.append(temp);
                // System.getProperty("line.separator")
                // ������֮��ķָ��� �൱�ڡ�\n��
                buf = buf.append(System.getProperty("line.separator"));
            }
            buf.append(filein);

            fos = new FileOutputStream(file2);
            pw = new PrintWriter(fos);
            pw.write(buf.toString().toCharArray());
            pw.flush();
            flag = true;
        } catch (IOException e1) {
            // TODO �Զ����� catch ��
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