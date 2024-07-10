package Pattern;

public class pattern {
    public static void main(String[] args) {
    int n = 5;
    int m = 4;

    //pattern 1
    System.out.println("\nPattern 1.\n");
    for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //pattern 2
    System.out.println("\nPattern 2.\n");
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(i == 0 || i == n-1 || j == 0 || j == m-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    
    //pattern 3
    System.out.println("\nPattern3.\n");
      
       for(int i=1; i<=m; i++) {
           for(int j=1; j<=i; j++) {
                   System.out.print("*");
           }
           System.out.println();
       }

    //pattern 4:
    System.out.println("\nPattern 4:-\n");
    for(int i=m; i>=1; i--) {
        for(int j=1; j<=i; j++) {
                System.out.print("*");
        }
        System.out.println();
    }

    //pattern 5:
    System.out.println("\nPattern 5:-\n");
    for(int i=m; i>=1; i--) {
        for(int j=1; j<i; j++) {
            System.out.print(" ");
        }
        for(int j=0; j<=n-i; j++) {
            System.out.print("*");
        }
        System.out.println();


   }

   //pattern 6:
    System.out.println("\nPattern 6:-\n");
    for(int i=1; i<=n; i++) {
        for(int j=1; j<=i; j++) {
            System.out.print(i);
        }
        System.out.println();
    }

    //pattern 7:
    System.out.println("\nPattern 7:-\n");
    for(int i=1; i<=n; i++) {
        for(int j=1; j<=i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }

    //pattern 8:
    System.out.println("\nPattern 8:-\n");
    for(int i=n; i>=1; i--) {
        for(int j=1; j<=i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }

    //pattern 9:
    System.out.println("\npattern 9:-\n");
    int number = 1;
       for(int i=1; i<=n; i++) {
           for(int j=1; j<=i; j++) {
               System.out.print(number+" ");
               number++;
           }
           System.out.println();
       }

    //pattern 10:
    System.out.println("\npattern 10:-\n");
    for(int i=1; i<=n; i++) {
        for(int j=1; j<=i; j++) {
            if((i+j) % 2 == 0) {
                System.out.print(1+" ");
            } else {
                System.out.print(0+" ");
            }
        }
        System.out.println();
    }

    //pattern 11:
    System.out.println("\npattern 11:-\n");
    //upper part
    for(int i=1; i<=n; i++) {
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        int spaces = 2 * (n-i);
        for(int j=1; j<=spaces; j++) {
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //lower part
    for(int i=n; i>=1; i--) {
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        int spaces = 2 * (n-i);
        for(int j=1; j<=spaces; j++) {
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }


    //pattern 12:
    System.out.println("\npattern 12:-\n");
    for(int i=1; i<=n; i++) {
        //spaces
        for(int j=1; j<=n-i; j++) {
            System.out.print(" ");
        }
        //stars
        for(int j=1; j<=n; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //pattern 13:
    System.out.println("\npattern 13:-\n");
    for(int i=1; i<=n; i++) {
        //spaces
        for(int j=1; j<=n-i; j++) {
            System.out.print(" ");
        }
        //numbers
        for(int j=1; j<=i; j++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    //pattern 14:
    System.out.println("\npattern 14:-\n");
    for(int i=1; i<=n; i++) {
        //spaces
        for(int j=1; j<=n-i; j++) {
            System.out.print(" ");
        }

        //first part
        for(int j=i; j>=1; j--) {
            System.out.print(j);
        }

        //second part
        for(int j=2; j<=i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }

    //pattern 15:
    System.out.println("\npattern 15:-\n");
       //upper part
       for(int i=1; i<=n; i++) {
        //spaces
        for(int j=1; j<=n-i; j++) {
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //lower part
    for(int i=n; i>=1; i--) {
        //spaces
        for(int j=1; j<=n-i; j++) {
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
}




