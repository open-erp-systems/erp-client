module erp.client.network {

    requires vertx.core;
    requires javafx.base;

    exports com.jukusoft.erp.network.manager;
    exports com.jukusoft.erp.network.message;
    exports com.jukusoft.erp.network.utils;
    exports com.jukusoft.erp.network.user;

}