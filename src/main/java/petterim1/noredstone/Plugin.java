package petterim1.noredstone;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.redstone.RedstoneUpdateEvent;
import cn.nukkit.plugin.PluginBase;

public class Plugin extends PluginBase implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.LOWEST)
    public void RedstoneUpdateEvent(RedstoneUpdateEvent e) {
        e.setCancelled(true);
    }
}
