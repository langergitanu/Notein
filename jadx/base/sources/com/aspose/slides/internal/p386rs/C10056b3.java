package com.aspose.slides.internal.p386rs;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p171hq.AbstractC4615c6;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p251li.C6097xk;
import com.aspose.slides.internal.p280ms.C6490k4;
import com.aspose.slides.internal.p403so.C10249b3;
import com.aspose.slides.internal.p403so.C10267jd;
import com.aspose.slides.internal.p403so.C10270kp;
import com.aspose.slides.internal.p403so.C10275os;
import com.aspose.slides.internal.p403so.C10278qw;
import com.aspose.slides.internal.p403so.C10283sv;
import com.aspose.slides.internal.p403so.C10292v4;
import com.aspose.slides.internal.p403so.C10296wl;
import com.aspose.slides.internal.p403so.C10298wy;
import com.aspose.slides.internal.p542z7.AbstractC13453k4;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.rs.b3 */
/* JADX INFO: loaded from: classes4.dex */
public class C10056b3 extends AbstractC13453k4 {
    /* JADX INFO: renamed from: k4 */
    private AbstractC4615c6 m49688k4(byte b, byte[] bArr) {
        AbstractC4623f9 abstractC4623f9M50221k4;
        C3134k4 c3134k4 = new C3134k4(new C3152yj(bArr));
        switch (b) {
            case 0:
                throw new C6490k4("The object is not a valid object.");
            case 1:
                abstractC4623f9M50221k4 = new C10267jd(bArr.length).m50221k4(c3134k4);
                break;
            case 2:
                abstractC4623f9M50221k4 = new C10270kp(bArr.length).m50224k4(c3134k4);
                break;
            case 3:
                abstractC4623f9M50221k4 = new C10283sv().m50237k4(c3134k4);
                break;
            case 4:
                abstractC4623f9M50221k4 = new C10278qw().m50232k4(c3134k4);
                break;
            case 5:
                abstractC4623f9M50221k4 = new C10298wy().m50252k4(c3134k4);
                break;
            case 6:
                abstractC4623f9M50221k4 = new C10292v4().m50246k4(c3134k4);
                break;
            case 7:
                abstractC4623f9M50221k4 = new C10275os().m50229k4(c3134k4);
                break;
            case 8:
                abstractC4623f9M50221k4 = new C10249b3().m50204k4(c3134k4);
                break;
            case 9:
                abstractC4623f9M50221k4 = new C10296wl().m50250k4(c3134k4);
                break;
            default:
                throw new C6490k4("Unknown object type: " + (b & 255));
        }
        return (AbstractC4615c6) abstractC4623f9M50221k4;
    }

    @Override // com.aspose.slides.internal.p542z7.AbstractC13453k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo49687k4(C6045bz[] c6045bzArr, AbstractC3150x6 abstractC3150x6) {
        C6097xk c6097xk = new C6097xk(c6045bzArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        if (!c6097xk.m24698kk()) {
            byte[] bArrM13372dy = c3134k4.m13372dy(c6097xk.mo24432H_());
            if (c6097xk.m24443rv().m52377kk().containsKey(Integer.valueOf(c6097xk.m24691dy() & 255))) {
                byte[] bArr = c6097xk.m24443rv().m52377kk().get_Item(Integer.valueOf(c6097xk.m24691dy() & 255));
                int length = bArr.length;
                byte[] bArr2 = new byte[c6097xk.mo24432H_() + length];
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) bArr2), 0, bArr.length);
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArrM13372dy), 0, AbstractC14092to.m67208k4((Object) bArr2), length, bArrM13372dy.length);
                c6097xk.m24443rv().m52377kk().removeItemByKey(Integer.valueOf(c6097xk.m24691dy() & 255));
                bArrM13372dy = bArr2;
            }
            c6097xk.m24694k4(m49688k4(c6097xk.m24699to(), bArrM13372dy));
            c6045bzArr[0] = c6097xk;
            return true;
        }
        c6097xk.m24697kk(c3134k4.m13386x6());
        byte[] bArrM13372dy2 = c3134k4.m13372dy(c6097xk.mo24432H_() - 4);
        c6097xk.m24695k4(bArrM13372dy2);
        if (!c6097xk.m24443rv().m52377kk().containsKey(Integer.valueOf(c6097xk.m24691dy() & 255))) {
            if (bArrM13372dy2.length < c6097xk.m24689c5()) {
                c6097xk.m24443rv().m52377kk().addItem(Integer.valueOf(c6097xk.m24691dy() & 255), bArrM13372dy2);
                c6045bzArr[0] = c6097xk;
                return true;
            }
            if (bArrM13372dy2.length != c6097xk.m24689c5()) {
                throw new C6490k4("Object reading error. Was read more bytes than the object size.");
            }
            c6097xk.m24694k4(m49688k4(c6097xk.m24699to(), bArrM13372dy2));
            c6045bzArr[0] = c6097xk;
            return true;
        }
        byte[] bArr3 = c6097xk.m24443rv().m52377kk().get_Item(Integer.valueOf(c6097xk.m24691dy() & 255));
        int length2 = bArr3.length;
        int length3 = bArr3.length + bArrM13372dy2.length;
        byte[] bArr4 = new byte[length3];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr3), 0, AbstractC14092to.m67208k4((Object) bArr4), 0, bArr3.length);
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArrM13372dy2), 0, AbstractC14092to.m67208k4((Object) bArr4), length2, bArrM13372dy2.length);
        if (length3 < c6097xk.m24689c5()) {
            c6097xk.m24443rv().m52377kk().set_Item(Integer.valueOf(c6097xk.m24691dy() & 255), bArr4);
            c6045bzArr[0] = c6097xk;
            return true;
        }
        if (length3 != c6097xk.m24689c5()) {
            throw new C6490k4("Object reading error. Was read more bytes than the object size.");
        }
        c6097xk.m24694k4(m49688k4(c6097xk.m24699to(), bArr4));
        c6097xk.m24443rv().m52377kk().removeItemByKey(Integer.valueOf(c6097xk.m24691dy() & 255));
        c6045bzArr[0] = c6097xk;
        return true;
    }
}
