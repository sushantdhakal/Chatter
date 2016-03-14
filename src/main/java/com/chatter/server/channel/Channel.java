package com.chatter.server.channel;

import com.chatter.server.account.UserAccount;

import java.util.List;

/**
 * Created by dhakals on 3/14/2016.
 */
public interface Channel {
    public List<UserAccount> getMembers();
    public Channel sendChannelMessage();
    public void unSubscribe(UserAccount account);
    public void subscribe(UserAccount account);
}
