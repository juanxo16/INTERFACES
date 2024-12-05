using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Security.Cryptography;
using System.Security.Policy;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace EjercicioLoteria
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            for (int i = 1; i < 50; i++)
            {
                checkedListBox1.Items.Add(i.ToString());
            }
        }

        private void limpiarCheckedBox()
        {
            for (int i = 0; i < checkedListBox1.Items.Count ; i++)
            {
                checkedListBox1.SetItemChecked(i, false);
            }
        }

        private void limpiarCampos()
        {
            txtbAciertos.Clear();
            textBox2.Clear();
            textBox3.Clear();
            textBox4.Clear();
            textBox5.Clear();
            textBox6.Clear();
            textBox7.Clear();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void btnNuevaApuesta_Click(object sender, EventArgs e)
        {
            limpiarCheckedBox();
            limpiarCampos();
        }

        private void btnJugar_Click(object sender, EventArgs e)
        {
            if (checkedListBox1.CheckedItems.Count != 6)
            {
                MessageBox.Show("Seleccione 6 numneros para poder jugar");
            }
            else
            {

            }
        }
    }
}
