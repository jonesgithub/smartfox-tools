package me.smecsia.smartfox.tools.common;

import com.smartfoxserver.v2.entities.data.ISFSObject;
import me.smecsia.common.serialize.TransportObject;

import static me.smecsia.smartfox.tools.util.SFSObjectUtil.deserialize;
import static me.smecsia.smartfox.tools.util.SFSObjectUtil.serialize;

/**
 *
 * @author Ilya Sadykov
 *         Date: 19.10.12
 *         Time: 15:30
 */
public abstract class AbstractTransportObject implements TransportObject {

    public ISFSObject toSFSObject() {
        return serialize(this);
    }

    public void updateFromSFSObject(ISFSObject obj) {
        deserialize(this, obj);
    }

    public String toJson() {
        return toSFSObject().toJson();
    }
}
