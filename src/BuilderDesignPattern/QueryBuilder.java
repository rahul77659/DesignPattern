package BuilderDesignPattern;

public class QueryBuilder {
    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;
    private QueryBuilder (Builder builder){
        this.select = builder.select;
        this.from = builder.from;
        this.where = builder.where;
        this.join = builder.join;
        this.orderBy = builder.orderBy;
        this.groupBy = builder.groupBy;

    }
    public static Builder builder ()
    {
        return new Builder();
    }
    public void setFrom(String from) {
        this.from = from;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public void setJoin(String join) {
        this.join = join;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getSelect() {
        return select;
    }

    public String getFrom() {
        return from;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public String getJoin() {
        return join;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public String getWhere() {
        return where;
    }

    /////////////Buildr Class
    public static class Builder {
        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        public QueryBuilder build() {
            return new QueryBuilder(this);
        }
        public Builder setFrom(String from) {
            this.from = from;
            return this;
        }

        public Builder setGroupBy(String groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        public Builder setJoin(String join) {
            this.join = join;
            return this;
        }

        public Builder setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public Builder setSelect(String select) {
            this.select = select;
            return this;
        }

        public Builder setWhere(String where) {
            this.where = where;
            return this;
        }

        public String getFrom() {
            return from;
        }

        public String getGroupBy() {
            return groupBy;
        }

        public String getJoin() {
            return join;
        }

        public String getOrderBy() {
            return orderBy;
        }

        public String getSelect() {
            return select;
        }

        public String getWhere() {
            return where;
        }
    }
}
