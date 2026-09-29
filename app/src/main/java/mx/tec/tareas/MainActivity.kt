package mx.tec.tareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import mx.tec.tareas.ui.screens.PantallaTareas
import mx.tec.tareas.ui.theme.TareasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TareasTheme { PantallaTareas() }
        }
    }
}
