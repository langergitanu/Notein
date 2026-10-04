package com.huawei.hms.drive;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.drive.av */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC17785av {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC17785av f52743a = new InterfaceC17785av() { // from class: com.huawei.hms.drive.av.1
        @Override // com.huawei.hms.drive.InterfaceC17785av
        /* JADX INFO: renamed from: a */
        public List<InetAddress> mo76043a(String str) throws UnknownHostException {
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
    };

    /* JADX INFO: renamed from: a */
    List<InetAddress> mo76043a(String str) throws UnknownHostException;
}
