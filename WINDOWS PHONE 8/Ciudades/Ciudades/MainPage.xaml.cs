using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Navigation;
using Microsoft.Phone.Controls;
using Microsoft.Phone.Shell;
using Ciudades.Resources;

namespace Ciudades
{
    public partial class MainPage : PhoneApplicationPage
    {
        // Constructor
        public MainPage()
        {
            InitializeComponent();

            // Sample code to localize the ApplicationBar
            //BuildLocalizedApplicationBar();
        }

        

        private void Eliminar(object sender, System.Windows.RoutedEventArgs e)
        {
			if(LCiudades.SelectedItem==null){
                MessageBox.Show("Seleccione algo por favor");
           	
            }else{
			LCiudades.Items.Remove(LCiudades.SelectedItem);
			}
			
			// TODO: Add event handler implementation here.
        }

        private void adicionar(object sender, System.Windows.RoutedEventArgs e)
        {
            String prueba;
            prueba = TBoxCiudad.Text;
           
            if (TBoxCiudad.Text == "")
            {
                MessageBox.Show("Esciba algo por favor");

            }
            else
            {
                if (LCiudades.Items.Count==0)
                {
                    LCiudades.Items.Add(TBoxCiudad.Text);
                    TBoxCiudad.Text = "";
                    //MessageBox.Show("Tamaño del lista11 :" + LCiudades.Items.Count);
                }
                else{
                    for (int i = 0; i < LCiudades.Items.Count; i++)
                    {
                        if (LCiudades.Items[i].ToString() == prueba)
                        {
                            MessageBox.Show(" Ya Existe.");
							TBoxCiudad.Text = "";
                            return;
                        }  
						 //LCiudades.Items.Add(TBoxCiudad.Text);
                   }
                        LCiudades.Items.Add(TBoxCiudad.Text);
                    TBoxCiudad.Text = "";
                    //MessageBox.Show("Tamaño del lista :" + LCiudades.Items.Count);
                }

                       

             }

                        
            
			
			
        	// TODO: Add event handler implementation here.
        }

        private void enfoque_tbox(object sender, System.Windows.RoutedEventArgs e)
        {

            TBoxCiudad.Text = "";
            // TODO: Add event handler implementation here.
        }

        

        


        // Sample code for building a localized ApplicationBar
        //private void BuildLocalizedApplicationBar()
        //{
        //    // Set the page's ApplicationBar to a new instance of ApplicationBar.
        //    ApplicationBar = new ApplicationBar();

        //    // Create a new button and set the text value to the localized string from AppResources.
        //    ApplicationBarIconButton appBarButton = new ApplicationBarIconButton(new Uri("/Assets/AppBar/appbar.add.rest.png", UriKind.Relative));
        //    appBarButton.Text = AppResources.AppBarButtonText;
        //    ApplicationBar.Buttons.Add(appBarButton);

        //    // Create a new menu item with the localized string from AppResources.
        //    ApplicationBarMenuItem appBarMenuItem = new ApplicationBarMenuItem(AppResources.AppBarMenuItemText);
        //    ApplicationBar.MenuItems.Add(appBarMenuItem);
        //}
    }
}