/**
 * 
 * @author manoj
 *
 */
public class Box {

        private Object object;

        /**
         * 
         * @param object
         */
        public void add(Object object) {
            this.object = object;
        }

        public Object get() {
            return object;
        }
    }