/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.harvard.twitter.schema;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Tweet extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Tweet\",\"namespace\":\"edu.harvard.twitter.schema\",\"fields\":[{\"name\":\"tweetId\",\"type\":\"int\"},{\"name\":\"user\",\"type\":\"string\"},{\"name\":\"text\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int tweetId;
  @Deprecated public java.lang.CharSequence user;
  @Deprecated public java.lang.CharSequence text;

  /**
   * Default constructor.
   */
  public Tweet() {}

  /**
   * All-args constructor.
   */
  public Tweet(java.lang.Integer tweetId, java.lang.CharSequence user, java.lang.CharSequence text) {
    this.tweetId = tweetId;
    this.user = user;
    this.text = text;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return tweetId;
    case 1: return user;
    case 2: return text;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: tweetId = (java.lang.Integer)value$; break;
    case 1: user = (java.lang.CharSequence)value$; break;
    case 2: text = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'tweetId' field.
   */
  public java.lang.Integer getTweetId() {
    return tweetId;
  }

  /**
   * Sets the value of the 'tweetId' field.
   * @param value the value to set.
   */
  public void setTweetId(java.lang.Integer value) {
    this.tweetId = value;
  }

  /**
   * Gets the value of the 'user' field.
   */
  public java.lang.CharSequence getUser() {
    return user;
  }

  /**
   * Sets the value of the 'user' field.
   * @param value the value to set.
   */
  public void setUser(java.lang.CharSequence value) {
    this.user = value;
  }

  /**
   * Gets the value of the 'text' field.
   */
  public java.lang.CharSequence getText() {
    return text;
  }

  /**
   * Sets the value of the 'text' field.
   * @param value the value to set.
   */
  public void setText(java.lang.CharSequence value) {
    this.text = value;
  }

  /** Creates a new Tweet RecordBuilder */
  public static edu.harvard.twitter.schema.Tweet.Builder newBuilder() {
    return new edu.harvard.twitter.schema.Tweet.Builder();
  }
  
  /** Creates a new Tweet RecordBuilder by copying an existing Builder */
  public static edu.harvard.twitter.schema.Tweet.Builder newBuilder(edu.harvard.twitter.schema.Tweet.Builder other) {
    return new edu.harvard.twitter.schema.Tweet.Builder(other);
  }
  
  /** Creates a new Tweet RecordBuilder by copying an existing Tweet instance */
  public static edu.harvard.twitter.schema.Tweet.Builder newBuilder(edu.harvard.twitter.schema.Tweet other) {
    return new edu.harvard.twitter.schema.Tweet.Builder(other);
  }
  
  /**
   * RecordBuilder for Tweet instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Tweet>
    implements org.apache.avro.data.RecordBuilder<Tweet> {

    private int tweetId;
    private java.lang.CharSequence user;
    private java.lang.CharSequence text;

    /** Creates a new Builder */
    private Builder() {
      super(edu.harvard.twitter.schema.Tweet.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.harvard.twitter.schema.Tweet.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Tweet instance */
    private Builder(edu.harvard.twitter.schema.Tweet other) {
            super(edu.harvard.twitter.schema.Tweet.SCHEMA$);
      if (isValidValue(fields()[0], other.tweetId)) {
        this.tweetId = data().deepCopy(fields()[0].schema(), other.tweetId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.user)) {
        this.user = data().deepCopy(fields()[1].schema(), other.user);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.text)) {
        this.text = data().deepCopy(fields()[2].schema(), other.text);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'tweetId' field */
    public java.lang.Integer getTweetId() {
      return tweetId;
    }
    
    /** Sets the value of the 'tweetId' field */
    public edu.harvard.twitter.schema.Tweet.Builder setTweetId(int value) {
      validate(fields()[0], value);
      this.tweetId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'tweetId' field has been set */
    public boolean hasTweetId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'tweetId' field */
    public edu.harvard.twitter.schema.Tweet.Builder clearTweetId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'user' field */
    public java.lang.CharSequence getUser() {
      return user;
    }
    
    /** Sets the value of the 'user' field */
    public edu.harvard.twitter.schema.Tweet.Builder setUser(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.user = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'user' field has been set */
    public boolean hasUser() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'user' field */
    public edu.harvard.twitter.schema.Tweet.Builder clearUser() {
      user = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'text' field */
    public java.lang.CharSequence getText() {
      return text;
    }
    
    /** Sets the value of the 'text' field */
    public edu.harvard.twitter.schema.Tweet.Builder setText(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.text = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'text' field has been set */
    public boolean hasText() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'text' field */
    public edu.harvard.twitter.schema.Tweet.Builder clearText() {
      text = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Tweet build() {
      try {
        Tweet record = new Tweet();
        record.tweetId = fieldSetFlags()[0] ? this.tweetId : (java.lang.Integer) defaultValue(fields()[0]);
        record.user = fieldSetFlags()[1] ? this.user : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.text = fieldSetFlags()[2] ? this.text : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
