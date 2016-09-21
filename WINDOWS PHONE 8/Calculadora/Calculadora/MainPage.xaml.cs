using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Navigation;
using Microsoft.Phone.Controls;
using Microsoft.Phone.Shell;
using Calculadora.Resources;

namespace Calculadora
{
    
    public partial class MainPage : PhoneApplicationPage
    {
        // Constructor
        double num1=0, num2=0, resul=0;
        int opera = 0;
        String resultado;
        public MainPage()
        {

            InitializeComponent();

            // Sample code to localize the ApplicationBar
            //BuildLocalizedApplicationBar();
        }
        
        private void enfoque_tbox(object sender, System.Windows.RoutedEventArgs e)
        {
            Tboxnumeros.Text = "";
        	// TODO: Add event handler implementation here.
        }

        private void Num1(object sender, System.Windows.RoutedEventArgs e)
        {
          //  num1 = 1;
            Tboxnumeros.Text = Tboxnumeros.Text + "1";
        	// TODO: Add event handler implementation here.
        }

        private void Num2(object sender, System.Windows.RoutedEventArgs e)
        {
        //    num1 = 2;
            Tboxnumeros.Text = Tboxnumeros.Text+"2";
        	// TODO: Add event handler implementation here.
        }

        private void Num3(object sender, System.Windows.RoutedEventArgs e)
        {
            //num1 = 3;
            Tboxnumeros.Text = Tboxnumeros.Text + "3";
        	// TODO: Add event handler implementation here.
        }

        private void Num4(object sender, System.Windows.RoutedEventArgs e)
        {
            //num1 = 4;
            Tboxnumeros.Text = Tboxnumeros.Text + "4";
        	// TODO: Add event handler implementation here.
        }

        private void Num5(object sender, System.Windows.RoutedEventArgs e)
        {
            //num1 = 5;
            Tboxnumeros.Text = Tboxnumeros.Text + "5";
        	// TODO: Add event handler implementation here.
        }

        private void Num6(object sender, System.Windows.RoutedEventArgs e)
        {
            //num1 = 6;
            Tboxnumeros.Text = Tboxnumeros.Text + "6";
        	// TODO: Add event handler implementation here.
        }

        private void Num7(object sender, System.Windows.RoutedEventArgs e)
        {
            //num1 = 7;
            Tboxnumeros.Text = Tboxnumeros.Text + "7";
        	// TODO: Add event handler implementation here.
        }

        private void Num8(object sender, System.Windows.RoutedEventArgs e)
        {
            //num1 = 8;
            Tboxnumeros.Text = Tboxnumeros.Text + "8";
        	// TODO: Add event handler implementation here.
        }

        private void Num9(object sender, System.Windows.RoutedEventArgs e)
        {
            //num1 = 9;
            Tboxnumeros.Text = Tboxnumeros.Text + "9";
        	// TODO: Add event handler implementation here.
        }

        private void Num0(object sender, System.Windows.RoutedEventArgs e)
        {
            //num1 = 0;
            Tboxnumeros.Text = Tboxnumeros.Text + "0";
        	// TODO: Add event handler implementation here.
        }

        private void mas(object sender, System.Windows.RoutedEventArgs e)
        {
            num1 = Convert.ToDouble(Tboxnumeros.Text);
            opera = 1;
            Tboxnumeros.Text = "";
        	// TODO: Add event handler implementation here.
        }

        private void menos(object sender, System.Windows.RoutedEventArgs e)
        {
            num1 = Convert.ToDouble(Tboxnumeros.Text);
            opera = 2;
            Tboxnumeros.Text = "";
        	// TODO: Add event handler implementation here.
        }

        private void multiplicacion(object sender, System.Windows.RoutedEventArgs e)
        {
            num1 = Convert.ToDouble(Tboxnumeros.Text);
            opera = 3;
            Tboxnumeros.Text = "";
            // TODO: Add event handler implementation here.
        }

        private void division(object sender, System.Windows.RoutedEventArgs e)
        {
            num1 = Convert.ToDouble(Tboxnumeros.Text);
            opera = 4;
            Tboxnumeros.Text = "";
        	// TODO: Add event handler implementation here.
        }

        private void bt_c(object sender, System.Windows.RoutedEventArgs e)
        {
            num1 = 0;
            num2 = 0;
            opera = 0;
            Tboxnumeros.Text = "";
        	// TODO: Add event handler implementation here.
        }

        private void igual(object sender, System.Windows.RoutedEventArgs e)
        {
            num2 = Convert.ToDouble(Tboxnumeros.Text);
            switch (opera)
            {
                case 1:
                    resul = num1 + num2;
                    break;
                case 2:
                    resul = num1 - num2;
                    break;
                case 3:
                    resul = num1 * num2;
                    break;
                case 4:
                    resul = num1 / num2;
                    break;
            }
            resultado = Convert.ToString(resul);
            Tboxnumeros.Text = resultado;
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