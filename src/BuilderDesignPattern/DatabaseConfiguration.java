package BuilderDesignPattern;

public class DatabaseConfiguration {
    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;
    private DatabaseConfiguration (DatabaseConfigurationBuilder builder) {
        this.databaseUrl = builder.databaseUrl;
        this.username = builder.username;
        this.password = builder.password;
        this.maxConnections = builder.maxConnections;
        this.enableCache = builder.enableCache;
        this.isReadOnly = builder.isReadOnly;
        this.enableCache = builder.enableCache;
//        this.enableCache = builder.enableCache;
    }
    public static DatabaseConfigurationBuilder builder() {
        return new DatabaseConfigurationBuilder();
    }


    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    public void setEnableCache(boolean enableCache) {
        this.enableCache = enableCache;
    }

    public void setReadOnly(boolean readOnly) {
        isReadOnly = readOnly;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public boolean isEnableCache() {
        return enableCache;
    }

    public boolean isReadOnly() {
        return isReadOnly;
    }


//    @WithBuilder
    public static class DatabaseConfigurationBuilder{
        private String databaseUrl;
        private String username;
        private String password;
        private int maxConnections;
        private boolean enableCache;
        private boolean isReadOnly;

        public DatabaseConfiguration build(){
                return new DatabaseConfiguration(this);
        }
        public DatabaseConfigurationBuilder setDatabaseUrl(String databaseUrl) {
            this.databaseUrl = databaseUrl;
            return this;
        }

        public DatabaseConfigurationBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public DatabaseConfigurationBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public DatabaseConfigurationBuilder setMaxConnections(int maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }

        public DatabaseConfigurationBuilder setEnableCache(boolean enableCache) {
            this.enableCache = enableCache;
            return this;
        }

        public DatabaseConfigurationBuilder setReadOnly(boolean readOnly) {
            isReadOnly = readOnly;
            return this;
        }

        public String getDatabaseUrl() {
            return databaseUrl;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public int getMaxConnections() {
            return maxConnections;
        }

        public boolean isEnableCache() {
            return enableCache;
        }

        public boolean isReadOnly() {
            return isReadOnly;
        }
    }
}
