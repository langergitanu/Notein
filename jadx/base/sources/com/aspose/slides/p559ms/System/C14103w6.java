package com.aspose.slides.p559ms.System;

import com.aspose.slides.C22218Oooo;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.w6 */
/* JADX INFO: loaded from: classes5.dex */
public class C14103w6 implements InterfaceC14059g8 {

    /* JADX INFO: renamed from: k4 */
    private int f47343k4;

    /* JADX INFO: renamed from: kk */
    private C14107wz f47344kk;

    /* JADX INFO: renamed from: to */
    private String f47345to;

    /* JADX INFO: renamed from: x1 */
    private String f47346x1;

    public C14103w6(int i, C14107wz c14107wz) {
        this(i, c14107wz, null);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        return new C14103w6(this.f47343k4, this.f47344kk);
    }

    /* JADX INFO: renamed from: k4 */
    public int m67327k4() {
        return this.f47343k4;
    }

    public String toString() {
        return m67328x1();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m67328x1() {
        String str;
        StringBuilder sbOooO0OO;
        String string;
        if (this.f47345to == null) {
            int i = this.f47343k4;
            if (i != 128) {
                switch (i) {
                    case 0:
                        str = "Microsoft Win32S ";
                        break;
                    case 1:
                        str = (this.f47344kk.m67340k4() <= 4 && (this.f47344kk.m67340k4() != 4 || this.f47344kk.m67343x1() <= 0)) ? "Microsoft Windows 95 " : "Microsoft Windows 98 ";
                        break;
                    case 2:
                        str = "Microsoft Windows NT ";
                        break;
                    case 3:
                        str = "Microsoft Windows CE ";
                        break;
                    case 4:
                        str = "Unix ";
                        break;
                    case 5:
                        str = "XBox ";
                        break;
                    case 6:
                        str = "Mac OS X ";
                        break;
                    case 7:
                        str = "Mac OS ";
                        break;
                    case 8:
                        str = "IBM ";
                        break;
                    default:
                        str = "<unknown> ";
                        break;
                }
                if (C14113y2.m67411k4(this.f47346x1)) {
                    sbOooO0OO = C22218Oooo.OooO0OO(str);
                    string = this.f47344kk.toString();
                } else {
                    sbOooO0OO = C22218Oooo.OooO0OO(str);
                    sbOooO0OO.append(this.f47344kk.m67342k4(2));
                    sbOooO0OO.append(" ");
                    string = this.f47346x1;
                }
                sbOooO0OO.append(string);
                this.f47345to = sbOooO0OO.toString();
            }
        }
        return this.f47345to;
    }

    public C14103w6(int i, C14107wz c14107wz, String str) {
        if (i < 0 || i > 8) {
            throw new ArgumentException("Illegal platform Id");
        }
        if (c14107wz == null) {
            throw new ArgumentNullException("version");
        }
        this.f47343k4 = i;
        this.f47344kk = (C14107wz) c14107wz.deepClone();
        this.f47346x1 = str;
    }
}
