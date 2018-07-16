class Call{
    public static void main (String []args)throws Exception{
        Process pro=Runtime.getRuntime().exec("G:\\thunder\\Program\\ThunderStart.exe");
        new Thread(new Runnable(){
           public void run(){
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                //TODO: handle exception
            }
			pro.destroy();
            System.out.print("test\n");
           }
        }).start();
       int exitcode=pro.waitFor();
       System.out.println("finish:"+exitcode);
    }
}