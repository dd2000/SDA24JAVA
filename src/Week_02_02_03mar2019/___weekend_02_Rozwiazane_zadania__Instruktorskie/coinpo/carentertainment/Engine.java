package Week_02_02_03mar2019.___weekend_02_Rozwiazane_zadania__Instruktorskie.coinpo.carentertainment;

public class Engine {
    private boolean started = false;
    private int capacity;
    private EngineType engineType;

    public Engine(int capacity, EngineType engineType) {
        this.capacity = capacity;
        this.engineType = engineType;
    }

    public boolean getStarted() {
        return started;
    }

    public void start() {
        started = true;
    }

    public int getCapacity() {
        return capacity;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "started=" + started +
                ", capacity=" + capacity +
                ", engineType=" + engineType +
                '}';
    }
}
