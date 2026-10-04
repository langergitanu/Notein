package com.huawei.hms.network.embedded;

import com.facebook.soloader.OooO0OO;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.q7 */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC18325q7 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC18325q7 f55967a = new OooO0OO();

    /* JADX INFO: renamed from: a */
    static /* synthetic */ List m79416a(String str) throws UnknownHostException {
        if (str == null) {
            throw new UnknownHostException("hostname == null");
        }
        try {
            return Arrays.asList(InetAddress.getAllByName(str));
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
