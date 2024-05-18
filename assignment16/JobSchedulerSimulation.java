package assignment16;

	import java.util.LinkedList;
	import java.util.Queue;

	class Job {
	    private static int idCounter = 1;
	    private final int id;
	    private final int processingTime;
	    private final int arrivalTime;
	    private int waitingTime;
	    private int turnaroundTime;

	    public Job(int processingTime, int arrivalTime) {
	        this.id = idCounter++;
	        this.processingTime = processingTime;
	        this.arrivalTime = arrivalTime;
	    }

	    
	    public static int getIdCounter() {
			return idCounter;
		}


		public static void setIdCounter(int idCounter) {
			Job.idCounter = idCounter;
		}


		public int getWaitingTime() {
			return waitingTime;
		}


		public void setWaitingTime(int waitingTime) {
			this.waitingTime = waitingTime;
		}


		public int getTurnaroundTime() {
			return turnaroundTime;
		}


		public void setTurnaroundTime(int turnaroundTime) {
			this.turnaroundTime = turnaroundTime;
		}


		public int getId() {
			return id;
		}


		public int getProcessingTime() {
			return processingTime;
		}


		public int getArrivalTime() {
			return arrivalTime;
		}


		@Override
	    public String toString() {
	        return "Job ID: " + id +
	               ", Waiting Time: " + waitingTime +
	               ", Turnaround Time: " + turnaroundTime;
	    }
	}

	class CPUScheduler {
	    private final Queue<Job> jobQueue = new LinkedList<>();
	    private int currentTime = 0;

	    public void addJob(Job job) {
	        jobQueue.add(job);
	    }

	    public void processJobs() {
	        while (!jobQueue.isEmpty()) {
	            Job job = jobQueue.poll();
	            job.setWaitingTime(currentTime - job.getArrivalTime());
	            job.setTurnaroundTime(job.getWaitingTime() + job.getProcessingTime());
	            currentTime += job.getProcessingTime();
	            System.out.println(job);
	        }
	    }
	}

	public class JobSchedulerSimulation {
	    public static void main(String[] args) {
	        CPUScheduler scheduler = new CPUScheduler();
	        
	        scheduler.addJob(new Job(5, 0));
	        scheduler.addJob(new Job(3, 2));
	        scheduler.addJob(new Job(8, 4));
	        scheduler.addJob(new Job(6, 6));

	        scheduler.processJobs();
	    }
	}


