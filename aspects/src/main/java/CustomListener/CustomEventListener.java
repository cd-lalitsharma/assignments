package CustomListener;

import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener<CustomEvent> {
    
    
    @Override
    public void onApplicationEvent(CustomEvent event) {
        event.DisplayName();
    }
}