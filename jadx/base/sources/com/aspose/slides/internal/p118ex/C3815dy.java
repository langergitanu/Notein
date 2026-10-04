package com.aspose.slides.internal.p118ex;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.internal.p174hz.C4756up;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.dy */
/* JADX INFO: loaded from: classes.dex */
public class C3815dy extends C3819jd {

    /* JADX INFO: renamed from: k4 */
    static String[] f10391k4 = {C14052dq.m66570kk()};

    public C3815dy() {
    }

    @Override // com.aspose.slides.internal.p118ex.C3819jd, com.aspose.slides.Collections.CollectionBase, java.lang.Iterable
    public IEnumerator iterator() {
        return new C3812c5(this);
    }

    /* JADX INFO: renamed from: k4 */
    public int m15262k4(C3823m9 c3823m9) {
        if (c3823m9 != null) {
            return getInnerList().addItem(c3823m9);
        }
        throw new ArgumentNullException("certificate");
    }

    public C3815dy(C3815dy c3815dy) {
        m15265k4(c3815dy);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3815dy m15263k4(int i, Object obj, boolean z) {
        String str;
        int iIntValue;
        if (obj == null) {
            throw new ArgumentNullException("findValue");
        }
        String str2 = C14113y2.f47374k4;
        C14084qq c14084qqClone = C14084qq.f47299x1.Clone();
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 9:
            case 14:
                try {
                    str = str2;
                    str2 = (String) obj;
                    iIntValue = 0;
                    C11697x1 c11697x1M55250kk = C11697x1.m55250kk();
                    C3815dy c3815dy = new C3815dy();
                    for (C3823m9 c3823m9 : getInnerList()) {
                        boolean zM67110kk = true;
                        switch (i) {
                            case 0:
                                if (C14113y2.m67383k4(str2, c3823m9.m15320qq(), true, c11697x1M55250kk) != 0 && C14113y2.m67383k4(str2, c3823m9.m15279du(), true, c11697x1M55250kk) != 0) {
                                    zM67110kk = false;
                                }
                                break;
                            case 1:
                                boolean z2 = false;
                                for (String str3 : C14113y2.m67417k4(c3823m9.m15326wl().mo15344k4(true), f10391k4, 1)) {
                                    z2 = C14113y2.m67381k4(str3, str2, C14113y2.m67429to(str3, '='), (short) 3) >= 0;
                                    if (z2) {
                                        zM67110kk = z2;
                                    }
                                    break;
                                }
                                zM67110kk = z2;
                                break;
                            case 2:
                                if (C14113y2.m67383k4(str2, c3823m9.m15292x1(), true, c11697x1M55250kk) != 0) {
                                    zM67110kk = false;
                                }
                                break;
                            case 3:
                                if (C14113y2.m67367h4(c3823m9.m15316k4(0, true), str2, (short) 3) < 0) {
                                    zM67110kk = false;
                                }
                                break;
                            case 4:
                                if (C14113y2.m67383k4(str2, c3823m9.m15284k4(), true, c11697x1M55250kk) != 0) {
                                    zM67110kk = false;
                                }
                                break;
                            case 5:
                                if (C14113y2.m67383k4(str2, c3823m9.m15322u4(), true, c11697x1M55250kk) != 0) {
                                    zM67110kk = false;
                                }
                                break;
                            case 6:
                                if (!C14084qq.m67124x1(c14084qqClone, c3823m9.m15321rv()) || !C14084qq.m67116to(c14084qqClone, c3823m9.m15318ks())) {
                                    zM67110kk = false;
                                }
                                break;
                            case 7:
                                zM67110kk = C14084qq.m67110kk(c14084qqClone, c3823m9.m15321rv());
                                break;
                            case 8:
                                zM67110kk = C14084qq.m67094k4(c14084qqClone, c3823m9.m15318ks());
                                break;
                            case 9:
                            case 11:
                            default:
                                zM67110kk = false;
                                break;
                            case 10:
                                if (c3823m9.m15324up().size() != 0) {
                                    zM67110kk = false;
                                }
                                break;
                            case 12:
                                if (c3823m9.m15324up().m15356k4(str) == null) {
                                    zM67110kk = false;
                                }
                                break;
                            case 13:
                                C3825qq c3825qq = (C3825qq) C7019kk.m27452k4((Object) c3823m9.m15324up().m15356k4("2.5.29.15"), C3825qq.class);
                                if (c3825qq != null && (c3825qq.m15330kk() & iIntValue) != iIntValue) {
                                    zM67110kk = false;
                                }
                                break;
                            case 14:
                                C3829um c3829um = (C3829um) C7019kk.m27452k4((Object) c3823m9.m15324up().m15356k4("2.5.29.14"), C3829um.class);
                                if (c3829um == null || C14113y2.m67383k4(str2, c3829um.m15349kk(), true, c11697x1M55250kk) != 0) {
                                    zM67110kk = false;
                                }
                                break;
                        }
                        if (zM67110kk) {
                            if (z) {
                                try {
                                    if (c3823m9.m15323um()) {
                                        c3815dy.m15262k4(c3823m9);
                                    }
                                } catch (RuntimeException unused) {
                                }
                            } else {
                                c3815dy.m15262k4(c3823m9);
                            }
                        }
                    }
                    return c3815dy;
                } catch (RuntimeException e) {
                    throw new CryptographicException(C14113y2.m67402k4("Invalid find value type '{0}', expected '{1}'.", C14067j2.m66727k4(obj), "string"), e);
                }
            case 6:
            case 7:
            case 8:
                try {
                    ((C14084qq) C7019kk.m27464to(obj, C14084qq.class)).CloneTo(c14084qqClone);
                    str = str2;
                    iIntValue = 0;
                    C11697x1 c11697x1M55250kk2 = C11697x1.m55250kk();
                    C3815dy c3815dy2 = new C3815dy();
                    while (r7.hasNext()) {
                    }
                    return c3815dy2;
                } catch (RuntimeException e2) {
                    throw new CryptographicException(C14113y2.m67402k4("Invalid find value type '{0}', expected '{1}'.", C14067j2.m66727k4(obj), "X509DateTime"), e2);
                }
            case 10:
            case 11:
            case 12:
                try {
                    str = (String) obj;
                    try {
                        C4756up.m19763kk(str);
                        iIntValue = 0;
                        C11697x1 c11697x1M55250kk22 = C11697x1.m55250kk();
                        C3815dy c3815dy22 = new C3815dy();
                        while (r7.hasNext()) {
                        }
                        return c3815dy22;
                    } catch (CryptographicUnexpectedOperationException unused2) {
                        throw new ArgumentException("findValue", C14113y2.m67402k4("Invalid OID value '{0}'.", str));
                    }
                } catch (RuntimeException e3) {
                    throw new CryptographicException(C14113y2.m67402k4("Invalid find value type '{0}', expected '{1}'.", C14067j2.m66727k4(obj), "X509KeyUsageFlags"), e3);
                }
            case 13:
                try {
                    iIntValue = ((Integer) obj).intValue();
                    str = str2;
                    C11697x1 c11697x1M55250kk222 = C11697x1.m55250kk();
                    C3815dy c3815dy222 = new C3815dy();
                    while (r7.hasNext()) {
                    }
                    return c3815dy222;
                } catch (RuntimeException e4) {
                    throw new CryptographicException(C14113y2.m67402k4("Invalid find value type '{0}', expected '{1}'.", C14067j2.m66727k4(obj), "X509KeyUsageFlags"), e4);
                }
            default:
                throw new CryptographicException(C14113y2.m67402k4("Invalid find type '{0}'.", C7019kk.m27466x1(i)));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m15267x1(C3823m9 c3823m9) {
        if (c3823m9 == null) {
            throw new ArgumentNullException("certificate");
        }
        Iterator<E> it = getInnerList().iterator();
        while (it.hasNext()) {
            if (((C3823m9) it.next()).m15288k4(c3823m9)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p118ex.C3819jd
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C3823m9 get_Item(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("negative index");
        }
        if (i < getInnerList().size()) {
            return (C3823m9) getInnerList().get_Item(i);
        }
        throw new ArgumentOutOfRangeException("index >= Count");
    }

    /* JADX INFO: renamed from: k4 */
    public void m15265k4(C3815dy c3815dy) {
        if (c3815dy == null) {
            throw new ArgumentNullException("certificates");
        }
        getInnerList().addRange(c3815dy);
    }
}
