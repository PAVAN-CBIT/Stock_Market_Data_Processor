public class Stockfileapplication
{

  public static void main(String args[]throws IOException
                        {
                          Stockfilereader fr=new Stockfilereader("table.csv");
                          List<HashMap<String,Double>>dataresult=populatestockfiledata(fr.getHeaders(),fr.readfiledata());
                          Stockfiledata filedata = new Stockfiledata();
                          filedata.adddata(dataresult);
                          filedata.printdata();
                          System.out.println(dataresult.size());
                         }
                          
  public static List<HashMap<String,Double>>populatestockfiledata(list<String>headers,list<string> lines
                                                                  {
                                                                   List<Hashmap<string,double>>dataresult = new Arraylist<>();
                                                                    for(String line : lines)
                                                                    {
                                                                    
                                                                     String[]values = line.split(",");
                                                                      int cnt = 0;
                                                                      HashMap<String,Double>headervaluemap = new Hashmap<>();
                                                                      for(String value:values)
                                                                      {
                                                                      
                                                                      double dval = Double.parseDouble(value);
                                                                        headervaluemap.put(headers.get(cnt),dval);
                                                                        cnt++;
                                                                      
                                                                      }
                                                                    dataresult.add(headervaluemap);
                                                                    
                                                                    
                                                                    }
                                                                  
                                                                  return dataresult;
                                                                  
                                                                  
                                                                  
                                                                  
                                                                  }
                                                                  



}
