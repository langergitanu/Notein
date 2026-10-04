package com.huawei.hms.api;

import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.core.aidl.C17756a;
import com.huawei.hms.core.aidl.C17757b;
import com.huawei.hms.core.aidl.C17760e;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.InterfaceC17758c;
import com.huawei.hms.core.aidl.ResponseHeader;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes6.dex */
public class IPCCallback extends InterfaceC17758c.a {

    /* JADX INFO: renamed from: a */
    private final Class<? extends IMessageEntity> f52462a;

    /* JADX INFO: renamed from: b */
    private final DatagramTransport.InterfaceC18470a f52463b;

    public IPCCallback(Class<? extends IMessageEntity> cls, DatagramTransport.InterfaceC18470a interfaceC18470a) {
        this.f52462a = cls;
        this.f52463b = interfaceC18470a;
    }

    @Override // com.huawei.hms.core.aidl.InterfaceC17758c
    public void call(C17757b c17757b) throws RemoteException {
        IMessageEntity iMessageEntityNewResponseInstance;
        if (c17757b == null || TextUtils.isEmpty(c17757b.f52535a)) {
            HMSLog.m80172e("IPCCallback", "In call, URI cannot be empty.");
            throw new RemoteException();
        }
        C17760e c17760eM75890a = C17756a.m75890a(c17757b.m75896c());
        if (c17757b.m75895b() > 0) {
            iMessageEntityNewResponseInstance = newResponseInstance();
            if (iMessageEntityNewResponseInstance != null) {
                c17760eM75890a.m75906a(c17757b.m75893a(), iMessageEntityNewResponseInstance);
            }
        } else {
            iMessageEntityNewResponseInstance = null;
        }
        if (c17757b.f52536b == null) {
            this.f52463b.mo80100a(0, iMessageEntityNewResponseInstance);
            return;
        }
        ResponseHeader responseHeader = new ResponseHeader();
        c17760eM75890a.m75906a(c17757b.f52536b, responseHeader);
        this.f52463b.mo80100a(responseHeader.getStatusCode(), iMessageEntityNewResponseInstance);
    }

    public IMessageEntity newResponseInstance() {
        Class<? extends IMessageEntity> cls = this.f52462a;
        if (cls == null) {
            return null;
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            HMSLog.m80172e("IPCCallback", "In newResponseInstance, instancing exception." + e.getMessage());
            return null;
        }
    }
}
