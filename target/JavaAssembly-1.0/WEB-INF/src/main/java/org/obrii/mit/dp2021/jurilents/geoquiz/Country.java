package org.obrii.mit.dp2021.jurilents.geoquiz;

public class Country {

//region Private fields

    private int _id;
    private String _name;
    private String _description;

    private String _imagePath;
    private String _flagPath;

    private boolean _hasSeaLine;
    private boolean _isInMountains;
    private boolean _isInForest;

    private Temperature _temperature;
    private Level _evolutionLevel;
    private Level _pollutionLevel;
    private Size _size;

//endregion


//region Constructors

    public Country() {
    }

    public Country(Builder builder) {
        this._id = builder._id;
        this._name = builder._name;
        this._description = builder._description;

        this._imagePath = builder._imagePath;
        this._flagPath = builder._flagPath;

        this._hasSeaLine = builder._hasSeaLine;
        this._isInMountains = builder._isInMountains;
        this._isInForest = builder._isInForest;

        this._temperature = builder._temperature;
        this._evolutionLevel = builder._evolutionLevel;
        this._pollutionLevel = builder._pollutionLevel;
        this._size = builder._size;
    }

    public static Builder builder() {
        return new Builder();
    }

//endregion


//region Public methods

    public float compareTo(Country other) {
        float result = 0;

        // 15 | has sea line
        if (_hasSeaLine == other._hasSeaLine) result += 15;
        // 25 | is in the mountains
        if (_isInMountains == other._isInMountains) result += 10;
        // 35 | is in the forest
        if (_isInForest == other._isInForest) result += 10;

        // 50 | has same evolution level
        result += compareLevels(_evolutionLevel, other._evolutionLevel, 15);
        // 60 | has same pollution level
        result += compareLevels(_pollutionLevel, other._pollutionLevel, 10);
        // 85 | has same temperature regime
        result += compareLevels(_temperature, other._temperature, 25);
        // 100 | has same size factor
        result += compareLevels(_size, other._size, 15);

        return result / 100f;
    }

//endregion


//region Private methods

    private <T extends Enum<T>> float compareLevels(T l1, T l2, float maxInfluence) {
        if (l1 == l2) return maxInfluence;

        int delta = Math.abs(l1.ordinal() - l2.ordinal());
        // if value are neighbored
        if (delta == 1) return maxInfluence / 2f;
        else return 0;
    }

//endregion


//region Accessors

    public String getName() {
        return _name;
    }

    public String getDescription() {
        return _description;
    }

    public String getImagePath() {
        return _imagePath;
    }

    public String getFlagPath() {
        return _flagPath;
    }


//endregion

    public static class Builder {

        //region Private fields

        private static int s_summary = 1;

        private int _id;
        private String _name;
        private String _description;

        private String _imagePath;
        private String _flagPath;

        private boolean _hasSeaLine;
        private boolean _isInMountains;
        private boolean _isInForest;

        private Temperature _temperature;
        private Level _evolutionLevel;
        private Level _pollutionLevel;
        private Size _size;

        //endregion

        public Country build() {
            _id = s_summary++;
            return new Country(this);
        }


        //region Accessors

        public Builder name(String name) {
            this._name = name;
            return this;
        }

        public Builder description(String description) {
            this._description = description;
            return this;
        }

        public Builder imagePath(String imagePath) {
            this._imagePath = imagePath;
            return this;
        }

        public Builder flagPath(String flagPath) {
            this._flagPath = flagPath;
            return this;
        }

        public Builder hasSeaLine(boolean hasSeaLine) {
            this._hasSeaLine = hasSeaLine;
            return this;
        }

        public Builder isInMountains(boolean isInMountains) {
            this._isInMountains = isInMountains;
            return this;
        }

        public Builder isInForest(boolean isInForest) {
            this._isInForest = isInForest;
            return this;
        }

        public Builder temperature(Temperature temperature) {
            this._temperature = temperature;
            return this;
        }

        public Builder evolutionLevel(Level evolutionLevel) {
            this._evolutionLevel = evolutionLevel;
            return this;
        }

        public Builder pollutionLevel(Level pollutionLevel) {
            this._pollutionLevel = pollutionLevel;
            return this;
        }

        public Builder size(Size size) {
            this._size = size;
            return this;
        }

        //endregion

    }


}
