﻿#pragma checksum "c:\users\xps\documents\visual studio 2012\Projects\BarraApp\BarraApp\MainPage.xaml" "{406ea660-64cf-4c82-b6f0-42d48172a799}" "23BD78A0308A7C681E4426F1A753A49D"
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

using Microsoft.Phone.Controls;
using Microsoft.Phone.Shell;
using System;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Automation.Peers;
using System.Windows.Automation.Provider;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Interop;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Imaging;
using System.Windows.Resources;
using System.Windows.Shapes;
using System.Windows.Threading;


namespace BarraApp {
    
    
    public partial class MainPage : Microsoft.Phone.Controls.PhoneApplicationPage {
        
        internal Microsoft.Phone.Shell.ApplicationBar AppBarMenu;
        
        internal Microsoft.Phone.Shell.ApplicationBarMenuItem ABMIopaco;
        
        internal Microsoft.Phone.Shell.ApplicationBarMenuItem APBMtraslucido;
        
        internal Microsoft.Phone.Shell.ApplicationBarMenuItem ABMItrasparente;
        
        internal Microsoft.Phone.Shell.ApplicationBarIconButton APBBoscuro;
        
        internal Microsoft.Phone.Shell.ApplicationBarIconButton APBBtraslucido;
        
        internal Microsoft.Phone.Shell.ApplicationBarIconButton APBBvisible;
        
        internal System.Windows.Controls.Grid LayoutRoot;
        
        internal System.Windows.Controls.StackPanel TitlePanel;
        
        internal System.Windows.Controls.Grid ContentPanel;
        
        internal System.Windows.Controls.Button BtMenu;
        
        private bool _contentLoaded;
        
        /// <summary>
        /// InitializeComponent
        /// </summary>
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        public void InitializeComponent() {
            if (_contentLoaded) {
                return;
            }
            _contentLoaded = true;
            System.Windows.Application.LoadComponent(this, new System.Uri("/BarraApp;component/MainPage.xaml", System.UriKind.Relative));
            this.AppBarMenu = ((Microsoft.Phone.Shell.ApplicationBar)(this.FindName("AppBarMenu")));
            this.ABMIopaco = ((Microsoft.Phone.Shell.ApplicationBarMenuItem)(this.FindName("ABMIopaco")));
            this.APBMtraslucido = ((Microsoft.Phone.Shell.ApplicationBarMenuItem)(this.FindName("APBMtraslucido")));
            this.ABMItrasparente = ((Microsoft.Phone.Shell.ApplicationBarMenuItem)(this.FindName("ABMItrasparente")));
            this.APBBoscuro = ((Microsoft.Phone.Shell.ApplicationBarIconButton)(this.FindName("APBBoscuro")));
            this.APBBtraslucido = ((Microsoft.Phone.Shell.ApplicationBarIconButton)(this.FindName("APBBtraslucido")));
            this.APBBvisible = ((Microsoft.Phone.Shell.ApplicationBarIconButton)(this.FindName("APBBvisible")));
            this.LayoutRoot = ((System.Windows.Controls.Grid)(this.FindName("LayoutRoot")));
            this.TitlePanel = ((System.Windows.Controls.StackPanel)(this.FindName("TitlePanel")));
            this.ContentPanel = ((System.Windows.Controls.Grid)(this.FindName("ContentPanel")));
            this.BtMenu = ((System.Windows.Controls.Button)(this.FindName("BtMenu")));
        }
    }
}
