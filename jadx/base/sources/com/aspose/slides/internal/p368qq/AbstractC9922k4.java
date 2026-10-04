package com.aspose.slides.internal.p368qq;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p489x1.InterfaceC12359fa;
import com.aspose.slides.internal.p492x4.AbstractC12384m9;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14091t6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.qq.k4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9922k4 implements InterfaceC9933up {

    /* JADX INFO: renamed from: to */
    private static final C12380dy f35807to = new C12380dy("\\\\[\\(\\)\\t\\n\\f\\r '\\\"]");

    /* JADX INFO: renamed from: k4 */
    private InterfaceC9933up f35808k4;

    /* JADX INFO: renamed from: kk */
    private short f35809kk;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC9933up f35810x1;

    public AbstractC9922k4(short s, InterfaceC9933up interfaceC9933up) {
        this.f35808k4 = interfaceC9933up;
        this.f35809kk = s;
        if (interfaceC9933up != null) {
            ((AbstractC9922k4) interfaceC9933up).f35810x1 = this;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static IGenericList<InterfaceC9933up> m48835k4(InterfaceC9933up interfaceC9933up) {
        List list = new List();
        while (true) {
            AbstractC9922k4 abstractC9922k4 = (AbstractC9922k4) interfaceC9933up;
            InterfaceC9933up interfaceC9933upMo48851kk = interfaceC9933up.mo48851kk();
            InterfaceC9933up interfaceC9933up2 = abstractC9922k4.f35808k4;
            if (interfaceC9933up2 != null) {
                ((AbstractC9922k4) interfaceC9933up2).f35810x1 = null;
                abstractC9922k4.f35808k4 = null;
            }
            InterfaceC9933up interfaceC9933up3 = abstractC9922k4.f35810x1;
            if (interfaceC9933up3 != null) {
                ((AbstractC9922k4) interfaceC9933up3).f35808k4 = null;
                abstractC9922k4.f35810x1 = null;
            }
            list.addItem(interfaceC9933up);
            if (interfaceC9933upMo48851kk == null) {
                return list;
            }
            interfaceC9933up = interfaceC9933upMo48851kk;
        }
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9933up
    /* JADX INFO: renamed from: c5 */
    public String mo48784c5() {
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9933up
    /* JADX INFO: renamed from: du */
    public int mo48834du() {
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9933up
    /* JADX INFO: renamed from: dy */
    public InterfaceC9933up mo48820dy() {
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9933up
    /* JADX INFO: renamed from: h4 */
    public float mo48788h4() {
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9933up
    /* JADX INFO: renamed from: kk */
    public final InterfaceC9933up mo48851kk() {
        return this.f35810x1;
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9933up
    /* JADX INFO: renamed from: m9 */
    public String mo48821m9() {
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9933up
    /* JADX INFO: renamed from: to */
    public final InterfaceC9933up mo48852to() {
        return this.f35808k4;
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9933up
    /* JADX INFO: renamed from: x1 */
    public final InterfaceC9933up mo48853x1() {
        InterfaceC9933up interfaceC9933upMo48852to = this;
        while (interfaceC9933upMo48852to.mo48852to() != null) {
            interfaceC9933upMo48852to = interfaceC9933upMo48852to.mo48852to();
        }
        return interfaceC9933upMo48852to;
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC9933up m48836k4(IGenericEnumerable<InterfaceC9933up> iGenericEnumerable) {
        IGenericEnumerator<InterfaceC9933up> it = iGenericEnumerable.iterator();
        it.hasNext();
        AbstractC9922k4 abstractC9922k4 = (AbstractC9922k4) it.next();
        while (it.hasNext()) {
            AbstractC9922k4 abstractC9922k42 = (AbstractC9922k4) it.next();
            abstractC9922k42.f35808k4 = abstractC9922k4;
            abstractC9922k4.f35810x1 = abstractC9922k42;
            abstractC9922k4 = abstractC9922k42;
        }
        return abstractC9922k4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC9933up m48845kk(InterfaceC9933up interfaceC9933up, InterfaceC12359fa interfaceC12359fa) {
        int i;
        AbstractC9911ar abstractC9911arM48776k4 = AbstractC9911ar.m48776k4(interfaceC12359fa);
        int iM48782to = abstractC9911arM48776k4.m48782to();
        if (iM48782to != 1) {
            if (iM48782to == 2) {
                iM48782to = abstractC9911arM48776k4.m48782to();
                i = -1;
            }
            if (iM48782to == 13) {
                return iM48782to != 42 ? new C9915ck((short) iM48782to, C14064he.m66707k4(abstractC9911arM48776k4.m48780kk(), C6344m9.f18038k4) * i, interfaceC9933up) : new C9921jd(interfaceC9933up, 0.0f, abstractC9911arM48776k4.m48780kk());
            }
            long[] jArr = {0};
            boolean zM67190k4 = C14091t6.m67190k4(abstractC9911arM48776k4.m48780kk(), jArr);
            long j = jArr[0];
            if (zM67190k4) {
                j *= (long) i;
                if (j < -2147483648L) {
                    return new C9920ix(interfaceC9933up, Integer.MIN_VALUE);
                }
                if (j > 2147483647L) {
                    return new C9920ix(interfaceC9933up, Integer.MAX_VALUE);
                }
            }
            return new C9920ix(interfaceC9933up, (int) j);
        }
        iM48782to = abstractC9911arM48776k4.m48782to();
        i = 1;
        if (iM48782to == 13) {
        }
    }

    /* JADX INFO: renamed from: to */
    public static InterfaceC9933up m48846to(InterfaceC9933up interfaceC9933up, InterfaceC12359fa interfaceC12359fa) {
        int iM67429to = C14113y2.m67429to(interfaceC12359fa.mo57918ck(), '(') + 1;
        String[] strArrM67414k4 = C14113y2.m67414k4(C14113y2.m67423kk(C14113y2.m67443x1(interfaceC12359fa.mo57918ck(), iM67429to, (interfaceC12359fa.mo57918ck().length() - 1) - iM67429to), '\'', '\"', '\t', '\n', '\f', ControlChar.PARAGRAPH_BREAK_CHAR, ControlChar.SPACE_CHAR), '%');
        C6765kp c6765kp = new C6765kp(strArrM67414k4[0]);
        for (int i = 1; i < strArrM67414k4.length; i++) {
            if (strArrM67414k4[i].length() >= 2) {
                int[] iArr = {0};
                boolean zM66589k4 = C14057f9.m66589k4(C14113y2.m67443x1(strArrM67414k4[i], 0, 2), 515, C6344m9.f18038k4, iArr);
                int i2 = iArr[0];
                if (zM66589k4) {
                    c6765kp.m26796k4("{0}{1}", Character.valueOf((char) i2), C14113y2.m67422kk(strArrM67414k4[i], 2));
                } else {
                    c6765kp.m26796k4("%{0}", strArrM67414k4[i]);
                }
            } else {
                c6765kp.m26796k4("%{0}", strArrM67414k4[i]);
            }
        }
        String string = c6765kp.toString();
        if (C14113y2.m67429to(string, IOUtils.DIR_SEPARATOR_WINDOWS) != -1) {
            string = f35807to.m57982k4(string, new AbstractC12384m9() { // from class: com.aspose.slides.internal.qq.k4.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.Css.Parser.AbstractCSSLexicalUnit.ReplaceEscapedIdentifiers(System.Text.RegularExpressions.Match)";
                }

                @Override // com.aspose.slides.internal.p492x4.AbstractC12384m9
                /* JADX INFO: renamed from: k4 */
                public String mo24906k4(C12385to c12385to) {
                    return AbstractC9922k4.m48849x1(c12385to);
                }
            });
        }
        return new C9912b3(interfaceC9933up, string);
    }

    /* JADX INFO: renamed from: x1 */
    public static InterfaceC9933up m48847x1(InterfaceC9933up interfaceC9933up, InterfaceC12359fa interfaceC12359fa) {
        int iM48831x1;
        int iM48831x12;
        int iM48831x13;
        String strMo57918ck = interfaceC12359fa.mo57918ck();
        int length = strMo57918ck.length() - 1;
        if (length == 3) {
            char cM67538rv = C14117yj.m67538rv(strMo57918ck.charAt(1));
            char cM67538rv2 = C14117yj.m67538rv(strMo57918ck.charAt(2));
            char cM67538rv3 = C14117yj.m67538rv(strMo57918ck.charAt(3));
            if (!C9919h4.m48828k4(cM67538rv) || !C9919h4.m48828k4(cM67538rv2) || !C9919h4.m48828k4(cM67538rv3)) {
                throw C9919h4.m48824k4(interfaceC12359fa);
            }
            int iM48831x14 = C9919h4.m48831x1(cM67538rv);
            iM48831x1 = iM48831x14 | (iM48831x14 << 4);
            int iM48831x15 = C9919h4.m48831x1(cM67538rv2);
            iM48831x12 = iM48831x15 | (iM48831x15 << 4);
            int iM48831x16 = C9919h4.m48831x1(cM67538rv3);
            iM48831x13 = iM48831x16 | (iM48831x16 << 4);
        } else {
            if (length != 6) {
                throw C9919h4.m48824k4(interfaceC12359fa);
            }
            char cM67538rv4 = C14117yj.m67538rv(strMo57918ck.charAt(1));
            char cM67538rv5 = C14117yj.m67538rv(strMo57918ck.charAt(2));
            char cM67538rv6 = C14117yj.m67538rv(strMo57918ck.charAt(3));
            char cM67538rv7 = C14117yj.m67538rv(strMo57918ck.charAt(4));
            char cM67538rv8 = C14117yj.m67538rv(strMo57918ck.charAt(5));
            char cM67538rv9 = C14117yj.m67538rv(strMo57918ck.charAt(6));
            if (!C9919h4.m48828k4(cM67538rv4) || !C9919h4.m48828k4(cM67538rv5) || !C9919h4.m48828k4(cM67538rv6) || !C9919h4.m48828k4(cM67538rv7) || !C9919h4.m48828k4(cM67538rv8) || !C9919h4.m48828k4(cM67538rv9)) {
                throw C9919h4.m48824k4(interfaceC12359fa);
            }
            iM48831x1 = (C9919h4.m48831x1(cM67538rv4) << 4) | C9919h4.m48831x1(cM67538rv5);
            iM48831x12 = (C9919h4.m48831x1(cM67538rv6) << 4) | C9919h4.m48831x1(cM67538rv7);
            iM48831x13 = C9919h4.m48831x1(cM67538rv9) | (C9919h4.m48831x1(cM67538rv8) << 4);
        }
        InterfaceC9933up interfaceC9933upM48837k4 = m48837k4((InterfaceC9933up) null, iM48831x1);
        m48837k4(m48837k4(interfaceC9933upM48837k4, iM48831x12), iM48831x13);
        return m48842k4(interfaceC9933up, (short) 27, interfaceC9933upM48837k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC9933up m48837k4(InterfaceC9933up interfaceC9933up, int i) {
        return new C9920ix(interfaceC9933up, i);
    }

    /* JADX INFO: renamed from: x1 */
    public static InterfaceC9933up m48848x1(InterfaceC9933up interfaceC9933up, String str) {
        return new C9927ne(interfaceC9933up, str);
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC9933up m48838k4(InterfaceC9933up interfaceC9933up, InterfaceC12359fa interfaceC12359fa) {
        List list = new List(AbstractC14092to.m67204k4((Object[]) C14113y2.m67416k4(interfaceC12359fa.mo57918ck(), new char[]{ControlChar.SPACE_CHAR}, (short) 1)));
        list.removeAt(0);
        return new C9932um((short) 47, C14113y2.m67403k4(" ", (String[]) list.toArray(new String[0])), interfaceC9933up);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static String m48849x1(C12385to c12385to) {
        return C14113y2.m67422kk(c12385to.toString(), 1);
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC9933up m48839k4(InterfaceC9933up interfaceC9933up, String str) {
        int length = str.length();
        int i = length - 1;
        int i2 = 1;
        int i3 = (str.charAt(0) == '\'' || str.charAt(0) == '\"') ? 1 : 0;
        int i4 = i3;
        if (str.charAt(i) == '\'' || str.charAt(i) == '\"') {
            length = i - i4;
        } else {
            i2 = i3;
        }
        return i2 != 0 ? new C9913bv(interfaceC9933up, C14113y2.m67443x1(str, i4, length)) : new C9913bv(interfaceC9933up, str);
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC9933up m48840k4(InterfaceC9933up interfaceC9933up, String str, InterfaceC9933up interfaceC9933up2) {
        return new C9918fa(interfaceC9933up, str, interfaceC9933up2);
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC9933up m48841k4(InterfaceC9933up interfaceC9933up, short s, float f) {
        return new C9915ck(s, f, interfaceC9933up);
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC9933up m48842k4(InterfaceC9933up interfaceC9933up, short s, InterfaceC9933up interfaceC9933up2) {
        return new C9928qq(interfaceC9933up, s, interfaceC9933up2);
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC9933up m48843k4(InterfaceC9933up interfaceC9933up, short s, String str) {
        return new C9932um(s, str, interfaceC9933up);
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9933up
    /* JADX INFO: renamed from: k4 */
    public final short mo48850k4() {
        return this.f35809kk;
    }
}
