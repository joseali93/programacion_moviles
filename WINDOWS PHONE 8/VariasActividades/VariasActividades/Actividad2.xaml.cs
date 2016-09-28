using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Navigation;
using Microsoft.Phone.Controls;
using Microsoft.Phone.Shell;

namespace VariasActividades
{
    public partial class Actividad2 : PhoneApplicationPage
    {
        public Actividad2()
        {
            InitializeComponent();
        }
        protected override void OnNavigatedTo(NavigationEventArgs e)
        {
            string cadena1 = "";
            string cadena2 = "";
            if (NavigationContext.QueryString.TryGetValue("nombre", out cadena1))
            {
                pagetitle.Text = cadena1;
                NavigationContext.QueryString.TryGetValue("txtnom", out cadena2);
                if (cadena1 == "Aceptar")
                {
                    recepcion.Text = "ud presiono el boton aceptar " + cadena2;
                }
                if (cadena1 == "Cancelar")
                {
                    recepcion.Text = "ud presiono el boton cancelar " + cadena2;
                }
            }
        }
    }
}