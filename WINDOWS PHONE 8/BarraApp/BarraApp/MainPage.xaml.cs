using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Navigation;
using Microsoft.Phone.Controls;
using Microsoft.Phone.Shell;
using BarraApp.Resources;

namespace BarraApp
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

        private void ABMIopaco_Click(object sender, System.EventArgs e)
        {
            BtMenu.Opacity = 1;	// TODO: Add event handler implementation here.
        }

        private void APBMtraslucido_Click(object sender, EventArgs e)
        {
            BtMenu.Opacity = 0.5;
        }

        private void ABMItrasparente_Click(object sender, EventArgs e)
        {
            BtMenu.Opacity = 0;
        }

        private void ApplicationBarIconButton_Click(object sender, EventArgs e)
        {
            this.ApplicationBar.Opacity = 1;
        }

        private void APBBoscuro_Click(object sender, EventArgs e)
        {
            this.ApplicationBar.Opacity = 0.5;
        }

        private void APBBtraslucido_Click(object sender, EventArgs e)
        {
            this.ApplicationBar.Opacity = 0;
        }

        private void APBBvisible_Click(object sender, EventArgs e)
        {

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