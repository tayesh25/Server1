public class DataStructure {
        Object[] data = new Object[100];

        int nextPut = 0;

        int nextGet = 0;

        int dataUsed = 0;

        public synchronized boolean put(Object obj) {
            if (dataUsed < 100) {
                dataUsed = dataUsed + 1;
                data[nextPut] = obj;
                if (nextPut < 99)  {
                    nextPut = nextPut + 1;
                } else {
                    nextPut = 0;
                }
                return true;
            } else {
                return false;
            }
        }

        // Methods
        public synchronized Object get() {
            if (dataUsed > 0) {
                Object value = data[nextGet];
                dataUsed = dataUsed - 1;
                if (nextGet < 99)  {
                    nextGet = nextGet + 1;
                } else {
                    nextGet = 0;
                }
                return value;
            } else {
                return null;
            }
        }

    }

