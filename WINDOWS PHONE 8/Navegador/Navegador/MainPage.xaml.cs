using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Navigation;
using Microsoft.Phone.Controls;
using Microsoft.Phone.Shell;
using Navegador.Resources;

using Microsoft.Phone.Tasks;

namespace Navegador
{
    public partial class MainPage : PhoneApplicationPage
    {
        // Constructor
        string urltemp;
        string urltempanterior="";
        string urltempdespues="";
        public MainPage()
        {
            InitializeComponent();

            // Sample code to localize the ApplicationBar
            //BuildLocalizedApplicationBar();
        }

        private void Tboxfocus(object sender, System.Windows.RoutedEventArgs e)
        {
            //Tboxurl.Text = "";
            // TODO: Add event handler implementation here.
        }

        private void btir(object sender, System.Windows.RoutedEventArgs e)
        {
            
            urltemp= Tboxurl.Text;
            Navegadorweb.Navigate(new Uri("http://" + urltemp  , UriKind.Absolute));
            
            
            // TODO: Add event handler implementation here.
        }

        private void BTadelante_click(object sender, System.Windows.RoutedEventArgs e)
        {
            urltemp = Tboxurl.Text;
            urltempdespues = urltemp;
            urltempanterior = urltemp;
            Navegadorweb.Navigate(new Uri("http://" + urltempdespues, UriKind.Absolute));
        	// TODO: Add event handler implementation here.
            
        }

        private void BTatras_click(object sender, System.Windows.RoutedEventArgs e)
        {
            Navegadorweb.Navigate(new Uri("http://" + urltempanterior  , UriKind.Absolute));
            Tboxurl.Text = urltempanterior;
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