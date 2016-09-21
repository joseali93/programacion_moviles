using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Navigation;
using Microsoft.Phone.Controls;
using Microsoft.Phone.Shell;
using Saludo.Resources;

namespace Saludo
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

        private void BTSaludar_Click(object sender, System.Windows.RoutedEventArgs e)
        {
            String sexo, bien1, bien2, bien3, bien4;
            
        	
            if (Femenimo.IsChecked == true)
            {
                sexo = "Femenino"; 
            }
            else
            {
                sexo = "Masculino"; 
            }
            if (Casa.IsChecked == true)
            {
                bien1 = "Casa";
            }
            else
            {
                bien1 = "";
            }
            if (Carro.IsChecked == true)
            {
                bien2 = "Carro";
            }
            else
            {
                bien2 = "";
            }
            if (Bici.IsChecked == true)
            {
                bien3 = "Bici";
            }
            else
            {
                bien3 = "";
            }
            if (Moto.IsChecked == true)
            {
                bien4 = "Moto";
            }
            else
            {
                bien4 = "";
            }
            MessageBox.Show("Bienvenido " + TBNombre.Text + " Ud es de sexo :" + sexo +" y posee los sigtes bienes :\n"+bien1+"\n"+bien2+"\n"+bien3+"\n"+bien4);
        	
			
			// TODO: Add event handler implementation here.
        }

        private void enfoque(object sender, System.Windows.RoutedEventArgs e)
        {
            TBNombre.Text="";
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