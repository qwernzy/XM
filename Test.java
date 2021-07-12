import java.io.File;
    public class Test {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            delete(new File("E:/C#OOP项目ATM取款机"));
        }
        //使用递归，判断如果是目录的话，就再执行此方法
        public static void delete(File f) {
            //System.out.println(f);
            if(f.isDirectory()){
                File[] files = f.listFiles();
                for (File file : files) {
                    delete(file);
                    file.delete();
                }
            }
            f.delete();
        }

        }


