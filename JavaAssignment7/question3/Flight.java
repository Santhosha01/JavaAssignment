package encapsulation.question3;

public class Flight {
		private String flightName;
		private String departureLocation;
		private String arrivalLocation;
		private String departureTime;
		private String arrivalTime;
		private int seatingCapacity;
		private long price;
		private static String airline="Air India";
		
		public static String getAirline() {
			return airline;
		}

		public String getFlightName() {
			return flightName;
		}


		public void setFlightName(String flightName) {
			this.flightName = flightName;
		}


		public String getDepartureLocation() {
			return departureLocation;
		}


		public void setDepartureLocation(String departureLocation) {
			this.departureLocation = departureLocation;
		}


		public String getArrivalLocation() {
			return arrivalLocation;
		}


		public void setArrivalLocation(String arrivalLocation) {
			this.arrivalLocation = arrivalLocation;
		}


		public String getDepartureTime() {
			return departureTime;
		}


		public void setDepartureTime(String departureTime) {
			this.departureTime = departureTime;
		}


		public String getArrivalTime() {
			return arrivalTime;
		}


		public void setArrivalTime(String arrivalTime) {
			this.arrivalTime = arrivalTime;
		}


		public int getSeatingCapacity() {
			return seatingCapacity;
		}


		public void setSeatingCapacity(int seatingCapacity) {
			this.seatingCapacity = seatingCapacity;
		}


		public double getPrice() {
			return price;
		}


		public void setPrice(long price) {
			this.price = price;
		}


		public void getDetails() {
			System.out.println("\nFlight Details : \n\n flight Name = " + flightName + " \n Departure Location = " + departureLocation
					+ " \n Arrival Location = " + arrivalLocation + " \n Departure Time = " + departureTime + " \n Arrival Time = "
					+ arrivalTime + " \n Seating Capacity = " + seatingCapacity + " \n Price=" + price+" \n AirLine = "+airline);
		}



		

}
