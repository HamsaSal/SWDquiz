//Hamsa Saleem 444000448

// Java code for linearly search x in arr[]. If x

// is present then return its location, otherwise

// return -1

class LinearSearch {

            // This function returns index of element x in arr[]

            static int search(int arr[], int n, int x)

            {

                        for (int a = 0; i < n; a++) {

                                // Return the index of the element if the element

                                    // is found

                                    if (arr[a] == x)

                                                return a;

                        }

 

                        // return -1 if the element is not found

                        return -1;

            }

 

            public static void main(String[] args)

            {

                        int[] arra = { 3, 4, 1, 7, 5 };

                        int n = arra.length;

                        int xy = 4;

                        int index = search(arra, n, xy);

                        if (index == -1)

                          System.out.println("Element is not present in the array");

                        else

                          System.out.println("Element found at position " + index);

            }

}

//------------------------------------------------------------------------------------------------------
