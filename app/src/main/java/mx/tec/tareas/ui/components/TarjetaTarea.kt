package mx.tec.tareas.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mx.tec.tareas.R
import mx.tec.tareas.domain.Tarea
import mx.tec.tareas.ui.theme.TareasTema
import mx.tec.tareas.ui.theme.TareasTheme

/**
 * Una tarea de la lista. Como la TarjetaAviso de la Práctica 7: ningún color,
 * tamaño ni radio escrito a mano. Todo sale del tema.
 */
@Composable
fun TarjetaTarea(tarea: Tarea, modifier: Modifier = Modifier) {
    val espaciado = TareasTema.espaciado

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.extraLarge,
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainerLow)
    ) {
        Column(
            modifier = Modifier.padding(espaciado.xl),
            verticalArrangement = Arrangement.spacedBy(espaciado.sm)
        ) {
            Surface(
                color = MaterialTheme.colorScheme.secondaryContainer,
                contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                shape = MaterialTheme.shapes.small
            ) {
                Text(
                    text = tarea.materia,
                    style = MaterialTheme.typography.labelMedium,
                    modifier = Modifier.padding(horizontal = espaciado.sm, vertical = 2.dp)
                )
            }
            Text(tarea.titulo, style = MaterialTheme.typography.titleLarge)
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(espaciado.xs)
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_reloj),
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.size(16.dp)
                )
                Text(
                    text = "Entrega: ${tarea.entrega}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TarjetaTareaPreview() {
    TareasTheme {
        TarjetaTarea(Tarea("Estudiar para el parcial", "Cálculo", "Jueves"), Modifier.padding(16.dp))
    }
}
