/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.harvard.avro.twitter;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface TwitterService {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"TwitterService\",\"namespace\":\"edu.harvard.avro.twitter\",\"types\":[{\"type\":\"record\",\"name\":\"TweetRecord\",\"fields\":[{\"name\":\"tweetId\",\"type\":\"int\"},{\"name\":\"text\",\"type\":\"string\"},{\"name\":\"username\",\"type\":\"string\"}]},{\"type\":\"error\",\"name\":\"SendError\",\"fields\":[{\"name\":\"message\",\"type\":\"string\"}]}],\"messages\":{\"sendTweet\":{\"request\":[{\"name\":\"tweet\",\"type\":\"TweetRecord\"}],\"response\":\"null\",\"errors\":[\"SendError\"]}}}");
  java.lang.Void sendTweet(edu.harvard.avro.twitter.TweetRecord tweet) throws org.apache.avro.AvroRemoteException, edu.harvard.avro.twitter.SendError;

  @SuppressWarnings("all")
  public interface Callback extends TwitterService {
    public static final org.apache.avro.Protocol PROTOCOL = edu.harvard.avro.twitter.TwitterService.PROTOCOL;
    void sendTweet(edu.harvard.avro.twitter.TweetRecord tweet, org.apache.avro.ipc.Callback<java.lang.Void> callback) throws java.io.IOException;
  }
}