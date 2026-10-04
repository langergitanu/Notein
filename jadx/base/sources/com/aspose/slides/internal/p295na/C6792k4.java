package com.aspose.slides.internal.p295na;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.na.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6792k4 extends C6793kk {

    /* JADX INFO: renamed from: k4 */
    private IGenericDictionary<String, IGenericEnumerable<KeyValuePair<String, String>>> f18807k4;

    /* JADX INFO: renamed from: kk */
    private int f18808kk;

    /* JADX INFO: renamed from: x1 */
    private IGenericDictionary<KeyValuePair<String, String>, IGenericEnumerable<KeyValuePair<String, String>>> f18809x1;

    /* JADX INFO: renamed from: k4 */
    public static C6792k4 m26864k4(IGenericDictionary<String, IGenericEnumerable<KeyValuePair<String, String>>> iGenericDictionary, int i, String str) {
        C6792k4 c6792k4 = (C6792k4) C6793kk.m26866k4(new C6792k4(), iGenericDictionary.getKeys(), str);
        c6792k4.f18809x1 = null;
        c6792k4.f18807k4 = new Dictionary(iGenericDictionary);
        c6792k4.f18808kk = i;
        return c6792k4;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    @Override // com.aspose.slides.internal.p295na.C6793kk, com.aspose.slides.internal.p199j5.InterfaceC5195kk
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public short mo22191k4(InterfaceC12777qq interfaceC12777qq) {
        IGenericEnumerable<KeyValuePair<String, String>> iGenericEnumerable;
        IGenericEnumerable<KeyValuePair<String, String>> iGenericEnumerable2;
        short sMo22191k4 = super.mo22191k4(interfaceC12777qq);
        if (sMo22191k4 != 1) {
            return sMo22191k4;
        }
        IGenericDictionary<String, IGenericEnumerable<KeyValuePair<String, String>>> iGenericDictionary = this.f18807k4;
        if (iGenericDictionary == null || !iGenericDictionary.containsKey(interfaceC12777qq.mo22612m9())) {
            if (this.f18809x1 != null) {
                KeyValuePair keyValuePair = new KeyValuePair(interfaceC12777qq.mo22634jd(), interfaceC12777qq.mo22604c5());
                if (this.f18809x1.containsKey(keyValuePair.Clone())) {
                    iGenericEnumerable2 = this.f18809x1.get_Item(keyValuePair.Clone());
                }
            }
            iGenericEnumerable = null;
            if (iGenericEnumerable != null) {
                return (short) 1;
            }
            IGenericEnumerator<KeyValuePair<String, String>> it = iGenericEnumerable.iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair<String, String> next = it.next();
                    if (interfaceC12777qq.mo22620A_().mo22857k4(next.getKey())) {
                        if (!C14113y2.m67411k4(next.getValue())) {
                            String strMo22741kk = interfaceC12777qq.mo22620A_().mo22861x1(next.getKey()).mo22741kk();
                            if (strMo22741kk == null || !C14113y2.m67412k4(strMo22741kk, next.getValue(), (short) 5)) {
                                if (this.f18808kk == 1) {
                                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                        it.dispose();
                                    }
                                    return (short) 3;
                                }
                            } else if (this.f18808kk == 0) {
                                return (short) 1;
                            }
                        } else if (this.f18808kk == 0) {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            return (short) 1;
                        }
                    } else if (this.f18808kk == 1) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        return (short) 3;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            return this.f18808kk == 1 ? (short) 1 : (short) 3;
        }
        iGenericEnumerable2 = this.f18807k4.get_Item(interfaceC12777qq.mo22612m9());
        iGenericEnumerable = iGenericEnumerable2;
        if (iGenericEnumerable != null) {
        }
    }
}
