using EntityFram.docs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EntityFram
{
    class Program
    {
        static void Main(string[] args)
        {
            using(var db = new BookEntities())
            {
                var newBook = new Book()
                {
                    Id = Guid.NewGuid(),
                    Name=$"Test - {DateTime.Now.Ticks}",
                };
                db.Books.Add(newBook);
                


                Guid id = Guid.Parse("9F754B7A-C8E7-4EFF-9134-FF8B0FB8E2F3");

                var book = db.Books.Where(x => x.Id == id).FirstOrDefault();
                book.Name = "Nazir's book";


                db.SaveChanges();

                Console.WriteLine("Dnone");
                Console.ReadKey();

               
            }
        }
    }
}
