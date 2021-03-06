package uniandes.isis2304.parranderos.negocio;

import java.util.List;

public interface VOHostal {
	
	public long getId();

	public long getIdProveedor();
		
		/**
		 * @return el nombre del bar
		 */
		public String getNombre();
		public String getHorario();
		public long getTelefono();
		public String getUbicacion();
		public String getEmail();
		
		public String toString();
		
		public List<Object[]> getHabs();

}
