class exx{

public enum Season  { WINTER, SPRING, SUMMER, FALL, AUTUMN}

public static void main(String[] args) {
for(int i=0;i<Season.values().length;i++)
{
   System.out.println((Season)Season.value);
}
System.out.println(Season.values(1));
}
}

