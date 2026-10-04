package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.C13968ri;
import com.aspose.slides.p559ms.System.Xml.C13969rq;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.dc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12942dc {

    /* JADX INFO: renamed from: com.aspose.slides.internal.yu.dc$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: fa */
        private static final C19071k4[] f43502fa = {new C19071k4('c', "\\p{_xmlC}"), new C19071k4('C', "\\P{_xmlC}"), new C19071k4('d', "\\p{_xmlD}"), new C19071k4('D', "\\P{_xmlD}"), new C19071k4('i', "\\p{_xmlI}"), new C19071k4('I', "\\P{_xmlI}"), new C19071k4('w', "\\p{_xmlW}"), new C19071k4('W', "\\P{_xmlW}")};

        /* JADX INFO: renamed from: c5 */
        private boolean f43503c5;

        /* JADX INFO: renamed from: ck */
        private C13090lv f43504ck;

        /* JADX INFO: renamed from: du */
        private int f43505du;

        /* JADX INFO: renamed from: dy */
        private int f43506dy;

        /* JADX INFO: renamed from: h4 */
        private AbstractC12892ae f43507h4;

        /* JADX INFO: renamed from: jd */
        private C6765kp f43508jd;

        /* JADX INFO: renamed from: k4 */
        private AbstractC13279x6 f43509k4;

        /* JADX INFO: renamed from: kk */
        private int f43510kk;

        /* JADX INFO: renamed from: m9 */
        private AbstractC12892ae f43511m9;

        /* JADX INFO: renamed from: to */
        private int f43512to;

        /* JADX INFO: renamed from: x1 */
        private C12909bg f43513x1;

        /* JADX INFO: renamed from: com.aspose.slides.internal.yu.dc$k4$k4, reason: collision with other inner class name */
        public static class C19071k4 extends AbstractC7020m9<C19071k4> {

            /* JADX INFO: renamed from: k4 */
            public char f43514k4;

            /* JADX INFO: renamed from: x1 */
            public String f43515x1;

            public C19071k4() {
            }

            /* JADX INFO: renamed from: x1 */
            private boolean m60201x1(C19071k4 c19071k4) {
                return c19071k4.f43514k4 == this.f43514k4 && C14067j2.m66728k4(c19071k4.f43515x1, this.f43515x1);
            }

            public Object clone() {
                return Clone();
            }

            public boolean equals(Object obj) {
                if (C14067j2.m66729x1(null, obj)) {
                    return false;
                }
                if (C14067j2.m66729x1(this, obj)) {
                    return true;
                }
                if (obj instanceof C19071k4) {
                    return m60201x1((C19071k4) obj);
                }
                return false;
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14079na
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C19071k4 Clone() {
                C19071k4 c19071k4 = new C19071k4();
                CloneTo(c19071k4);
                return c19071k4;
            }

            public C19071k4(char c, String str) {
                this.f43514k4 = c;
                this.f43515x1 = str;
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14079na
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public void CloneTo(C19071k4 c19071k4) {
                if (c19071k4 == null) {
                    c19071k4 = new C19071k4();
                }
                c19071k4.f43514k4 = this.f43514k4;
                c19071k4.f43515x1 = this.f43515x1;
            }
        }

        public k4() {
        }

        /* JADX INFO: renamed from: k4 */
        private Object m60176k4(AbstractC12892ae abstractC12892ae, AbstractC12945di abstractC12945di, String str, InterfaceC13980t6 interfaceC13980t6, AbstractC13883dt abstractC13883dt) {
            Object[] objArr = {null};
            RuntimeException runtimeExceptionMo60028k4 = abstractC12892ae.mo60028k4(abstractC12945di.m60233k4(), abstractC13883dt, interfaceC13980t6, objArr);
            Object obj = objArr[0];
            if (runtimeExceptionMo60028k4 == null) {
                return obj;
            }
            throw new XmlSchemaException(str, new String[]{runtimeExceptionMo60028k4.getMessage()}, runtimeExceptionMo60028k4, abstractC12945di.m60693xk(), abstractC12945di.m60676ak(), abstractC12945di.m60678dq(), abstractC12945di);
        }

        /* JADX INFO: renamed from: to */
        private void m60182to() {
            C12909bg c12909bgMo60033up = this.f43509k4.mo60033up();
            C12909bg c12909bg = this.f43513x1;
            if ((c12909bg.f43449up & 1) == 0 && (this.f43510kk & 1) != 0) {
                c12909bg.f43445k4 = c12909bgMo60033up.f43445k4;
                m60178k4(1);
            }
            C12909bg c12909bg2 = this.f43513x1;
            if ((c12909bg2.f43449up & 2) == 0 && (this.f43510kk & 2) != 0) {
                c12909bg2.f43450x1 = c12909bgMo60033up.f43450x1;
                m60178k4(2);
            }
            C12909bg c12909bg3 = this.f43513x1;
            if ((c12909bg3.f43449up & 4) == 0 && (this.f43510kk & 4) != 0) {
                c12909bg3.f43446kk = c12909bgMo60033up.f43446kk;
                m60178k4(4);
            }
            if ((this.f43510kk & 8) != 0) {
                C12909bg c12909bg4 = this.f43513x1;
                ArrayList arrayList = c12909bg4.f43448to;
                if (arrayList == null) {
                    c12909bg4.f43448to = c12909bgMo60033up.f43448to;
                } else {
                    arrayList.addRange(c12909bgMo60033up.f43448to);
                }
                m60178k4(8);
            }
            if ((this.f43510kk & 16) != 0) {
                C12909bg c12909bg5 = this.f43513x1;
                if (c12909bg5.f43440du == null) {
                    c12909bg5.f43440du = c12909bgMo60033up.f43440du;
                }
                m60178k4(16);
            }
            C12909bg c12909bg6 = this.f43513x1;
            if ((c12909bg6.f43449up & 32) == 0 && (this.f43510kk & 32) != 0) {
                c12909bg6.f43443h4 = c12909bgMo60033up.f43443h4;
                m60178k4(32);
            }
            C12909bg c12909bg7 = this.f43513x1;
            if ((c12909bg7.f43449up & 64) == 0 && (this.f43510kk & 64) != 0) {
                c12909bg7.f43447m9 = c12909bgMo60033up.f43447m9;
                m60178k4(64);
            }
            C12909bg c12909bg8 = this.f43513x1;
            if ((c12909bg8.f43449up & 128) == 0 && (this.f43510kk & 128) != 0) {
                c12909bg8.f43441dy = c12909bgMo60033up.f43441dy;
                m60178k4(128);
            }
            C12909bg c12909bg9 = this.f43513x1;
            if ((c12909bg9.f43449up & 256) == 0 && (this.f43510kk & 256) != 0) {
                c12909bg9.f43438c5 = c12909bgMo60033up.f43438c5;
                m60178k4(256);
            }
            C12909bg c12909bg10 = this.f43513x1;
            if ((c12909bg10.f43449up & 512) == 0 && (this.f43510kk & 512) != 0) {
                c12909bg10.f43444jd = c12909bgMo60033up.f43444jd;
                m60178k4(512);
            }
            C12909bg c12909bg11 = this.f43513x1;
            if ((c12909bg11.f43449up & 1024) == 0 && (this.f43510kk & 1024) != 0) {
                c12909bg11.f43439ck = c12909bgMo60033up.f43439ck;
                m60178k4(1024);
            }
            C12909bg c12909bg12 = this.f43513x1;
            if ((c12909bg12.f43449up & 2048) != 0 || (this.f43510kk & 2048) == 0) {
                return;
            }
            c12909bg12.f43442fa = c12909bgMo60033up.f43442fa;
            m60178k4(2048);
        }

        /* JADX INFO: renamed from: c5 */
        public final void m60185c5(AbstractC12945di abstractC12945di) {
            m60180k4(abstractC12945di, 1024, "The TotalDigits constraining facet is prohibited for '{0}'.");
            m60183x1(abstractC12945di, 1024, "This is a duplicate TotalDigits constraining facet.");
            AbstractC12892ae abstractC12892aeM60211bz = AbstractC13279x6.m61676kk(52).m60211bz();
            this.f43513x1.f43439ck = AbstractC12972ev.m60484x1(((C14046bv) C7019kk.m27464to(m60176k4(abstractC12892aeM60211bz, abstractC12945di, "The TotalDigits constraining facet is invalid - {0}", null, null), C14046bv.class)).Clone());
            if ((this.f43512to & 1024) != 0) {
                AbstractC13279x6 abstractC13279x6 = this.f43509k4;
                if (!abstractC13279x6.mo60031k4(Integer.valueOf(abstractC13279x6.mo60033up().f43439ck), Integer.valueOf(this.f43513x1.f43439ck))) {
                    throw new XmlSchemaException("Values that are declared as {fixed} in a base type can not be changed in a derived type.", abstractC12945di);
                }
            }
            if ((this.f43510kk & 1024) != 0 && this.f43513x1.f43439ck > this.f43509k4.mo60033up().f43439ck) {
                throw new XmlSchemaException("It is an error if the derived 'totalDigits' facet value is greater than the parent 'totalDigits' facet value.", C14113y2.f47374k4);
            }
            m60179k4(abstractC12945di, 1024);
        }

        public Object clone() {
            return Clone();
        }

        /* JADX INFO: renamed from: du */
        public final void m60186du(AbstractC12945di abstractC12945di) {
            m60180k4(abstractC12945di, 64, "The MaxInclusive constraining facet is prohibited for '{0}'.");
            m60183x1(abstractC12945di, 64, "This is a duplicate MaxInclusive constraining facet.");
            this.f43513x1.f43447m9 = m60176k4(this.f43511m9, abstractC12945di, "The MaxInclusive constraining facet is invalid - {0}", null, null);
            if ((this.f43512to & 64) != 0) {
                AbstractC13279x6 abstractC13279x6 = this.f43509k4;
                if (!abstractC13279x6.mo60031k4(abstractC13279x6.mo60033up().f43447m9, this.f43513x1.f43447m9)) {
                    throw new XmlSchemaException("Values that are declared as {fixed} in a base type can not be changed in a derived type.", abstractC12945di);
                }
            }
            m60181k4(this.f43513x1.f43447m9, abstractC12945di);
            m60179k4(abstractC12945di, 64);
        }

        /* JADX INFO: renamed from: dy */
        public final void m60187dy(AbstractC12945di abstractC12945di) {
            m60180k4(abstractC12945di, 512, "The MinExclusive constraining facet is prohibited for '{0}'.");
            m60183x1(abstractC12945di, 512, "This is a duplicate MinExclusive constraining facet.");
            this.f43513x1.f43444jd = m60176k4(this.f43511m9, abstractC12945di, "The MinExclusive constraining facet is invalid - {0}", null, null);
            if ((this.f43512to & 512) != 0) {
                AbstractC13279x6 abstractC13279x6 = this.f43509k4;
                if (!abstractC13279x6.mo60031k4(abstractC13279x6.mo60033up().f43444jd, this.f43513x1.f43444jd)) {
                    throw new XmlSchemaException("Values that are declared as {fixed} in a base type can not be changed in a derived type.", abstractC12945di);
                }
            }
            m60181k4(this.f43513x1.f43444jd, abstractC12945di);
            m60179k4(abstractC12945di, 512);
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof k4) {
                return m60184x1((k4) obj);
            }
            return false;
        }

        /* JADX INFO: renamed from: h4 */
        public final void m60188h4(AbstractC12945di abstractC12945di) {
            m60180k4(abstractC12945di, 128, "The MaxExclusive constraining facet is prohibited for '{0}'.");
            m60183x1(abstractC12945di, 128, "This is a duplicate MaxExclusive constraining facet.");
            this.f43513x1.f43441dy = m60176k4(this.f43511m9, abstractC12945di, "The MaxExclusive constraining facet is invalid - {0}", null, null);
            if ((this.f43512to & 128) != 0) {
                AbstractC13279x6 abstractC13279x6 = this.f43509k4;
                if (!abstractC13279x6.mo60031k4(abstractC13279x6.mo60033up().f43441dy, this.f43513x1.f43441dy)) {
                    throw new XmlSchemaException("Values that are declared as {fixed} in a base type can not be changed in a derived type.", abstractC12945di);
                }
            }
            m60181k4(this.f43513x1.f43441dy, abstractC12945di);
            m60179k4(abstractC12945di, 128);
        }

        /* JADX INFO: renamed from: jd */
        public final void m60189jd(AbstractC12945di abstractC12945di) {
            m60180k4(abstractC12945di, 2048, "The FractionDigits constraining facet is prohibited for '{0}'.");
            m60183x1(abstractC12945di, 2048, "This is a duplicate FractionDigits constraining facet.");
            this.f43513x1.f43442fa = AbstractC12972ev.m60484x1(((C14046bv) C7019kk.m27464to(m60176k4(this.f43507h4, abstractC12945di, "The FractionDigits constraining facet is invalid - {0}", null, null), C14046bv.class)).Clone());
            if (this.f43513x1.f43442fa != 0 && this.f43509k4.mo60020fa() != 14) {
                throw new XmlSchemaException("The FractionDigits constraining facet is invalid - {0}", C13968ri.m65818k4("FractionDigits should be equal to 0 on types other then decimal."), abstractC12945di);
            }
            if ((this.f43510kk & 2048) != 0 && this.f43513x1.f43442fa > this.f43509k4.mo60033up().f43442fa) {
                throw new XmlSchemaException("It is an error if the derived 'totalDigits' facet value is greater than the parent 'totalDigits' facet value.", C14113y2.f47374k4);
            }
            m60179k4(abstractC12945di, 2048);
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
        public k4 Clone() {
            k4 k4Var = new k4();
            CloneTo(k4Var);
            return k4Var;
        }

        /* JADX INFO: renamed from: m9 */
        public final void m60197m9(AbstractC12945di abstractC12945di) {
            m60180k4(abstractC12945di, 256, "The MinInclusive constraining facet is prohibited for '{0}'.");
            m60183x1(abstractC12945di, 256, "This is a duplicate MinInclusive constraining facet.");
            this.f43513x1.f43438c5 = m60176k4(this.f43511m9, abstractC12945di, "The MinInclusive constraining facet is invalid - {0}", null, null);
            if ((this.f43512to & 256) != 0) {
                AbstractC13279x6 abstractC13279x6 = this.f43509k4;
                if (!abstractC13279x6.mo60031k4(abstractC13279x6.mo60033up().f43438c5, this.f43513x1.f43438c5)) {
                    throw new XmlSchemaException("Values that are declared as {fixed} in a base type can not be changed in a derived type.", abstractC12945di);
                }
            }
            m60181k4(this.f43513x1.f43438c5, abstractC12945di);
            m60179k4(abstractC12945di, 256);
        }

        /* JADX INFO: renamed from: x1 */
        public final void m60199x1() {
            this.f43509k4.mo60033up();
            int i = this.f43513x1.f43449up;
            if ((i & 64) != 0 && (i & 128) != 0) {
                throw new XmlSchemaException("'maxInclusive' and 'maxExclusive' cannot both be specified for the same data type.", C14113y2.f47374k4);
            }
            if ((i & 256) != 0 && (i & 512) != 0) {
                throw new XmlSchemaException("'minInclusive' and 'minExclusive' cannot both be specified for the same data type.", C14113y2.f47374k4);
            }
            if ((i & 1) != 0 && (i & 6) != 0) {
                throw new XmlSchemaException("It is an error for both length and minLength or maxLength to be present.", C14113y2.f47374k4);
            }
            m60182to();
            C12909bg c12909bg = this.f43513x1;
            int i2 = c12909bg.f43449up;
            if ((i2 & 2) != 0 && (i2 & 4) != 0 && c12909bg.f43450x1 > c12909bg.f43446kk) {
                throw new XmlSchemaException("MinLength is greater than MaxLength.", C14113y2.f47374k4);
            }
            if ((i2 & 256) != 0 && (i2 & 64) != 0 && this.f43509k4.mo60034x1(c12909bg.f43438c5, c12909bg.f43447m9) > 0) {
                throw new XmlSchemaException("The value specified for 'minInclusive' cannot be greater than the value specified for 'maxInclusive' for the same data type.", C14113y2.f47374k4);
            }
            C12909bg c12909bg2 = this.f43513x1;
            int i3 = c12909bg2.f43449up;
            if ((i3 & 256) != 0 && (i3 & 128) != 0 && this.f43509k4.mo60034x1(c12909bg2.f43438c5, c12909bg2.f43441dy) > 0) {
                throw new XmlSchemaException("The value specified for 'minInclusive' cannot be greater than the value specified for 'maxExclusive' for the same data type.", C14113y2.f47374k4);
            }
            C12909bg c12909bg3 = this.f43513x1;
            int i4 = c12909bg3.f43449up;
            if ((i4 & 512) != 0 && (i4 & 128) != 0 && this.f43509k4.mo60034x1(c12909bg3.f43444jd, c12909bg3.f43441dy) > 0) {
                throw new XmlSchemaException("The value specified for 'minExclusive' cannot be greater than the value specified for 'maxExclusive' for the same data type.", C14113y2.f47374k4);
            }
            C12909bg c12909bg4 = this.f43513x1;
            int i5 = c12909bg4.f43449up;
            if ((i5 & 512) != 0 && (i5 & 64) != 0 && this.f43509k4.mo60034x1(c12909bg4.f43444jd, c12909bg4.f43447m9) > 0) {
                throw new XmlSchemaException("The value specified for 'minExclusive' cannot be greater than the value specified for 'maxInclusive' for the same data type.", C14113y2.f47374k4);
            }
            C12909bg c12909bg5 = this.f43513x1;
            if ((c12909bg5.f43449up & 3072) == 3072 && c12909bg5.f43442fa > c12909bg5.f43439ck) {
                throw new XmlSchemaException("FractionDigits is greater than TotalDigits.", C14113y2.f47374k4);
            }
        }

        public k4(AbstractC13279x6 abstractC13279x6, C12909bg c12909bg) {
            this.f43503c5 = true;
            this.f43508jd = null;
            this.f43504ck = null;
            this.f43509k4 = abstractC13279x6;
            this.f43513x1 = c12909bg;
            int iMo60020fa = 0;
            this.f43510kk = abstractC13279x6.mo60033up() != null ? this.f43509k4.mo60033up().f43449up : 0;
            this.f43512to = this.f43509k4.mo60033up() != null ? this.f43509k4.mo60033up().f43451yj : 0;
            this.f43505du = this.f43509k4.mo60044ne();
            this.f43507h4 = AbstractC13279x6.m61676kk(47).m60211bz();
            if (!C7019kk.m27469x1(this.f43509k4, C13301y9.class) && !C7019kk.m27469x1(this.f43509k4, C13265wl.class)) {
                iMo60020fa = this.f43509k4.mo60020fa();
            }
            this.f43506dy = iMo60020fa;
            this.f43511m9 = iMo60020fa > 0 ? AbstractC13279x6.m61676kk(iMo60020fa).m60211bz() : this.f43509k4;
        }

        /* JADX INFO: renamed from: k4 */
        private static String m60177k4(String str) {
            C6765kp c6765kpOooO00o = OooO00o.OooO00o("^");
            char[] cArrM67365dy = C14113y2.m67365dy(str);
            int length = str.length();
            int i = 0;
            int i2 = 0;
            while (i < length - 2) {
                if (cArrM67365dy[i] == '\\') {
                    int i3 = i + 1;
                    char c = cArrM67365dy[i3];
                    if (c == '\\') {
                        i = i3;
                    } else {
                        int i4 = 0;
                        while (true) {
                            C19071k4[] c19071k4Arr = f43502fa;
                            if (i4 >= c19071k4Arr.length) {
                                break;
                            }
                            if (c19071k4Arr[i4].f43514k4 == c) {
                                if (i2 < i) {
                                    c6765kpOooO00o.m26799k4(cArrM67365dy, i2, i - i2);
                                }
                                c6765kpOooO00o.m26792k4(c19071k4Arr[i4].f43515x1);
                                i2 = i + 2;
                            } else {
                                i4++;
                            }
                        }
                        i = i3;
                    }
                }
                i++;
            }
            if (i2 < length) {
                c6765kpOooO00o.m26799k4(cArrM67365dy, i2, length - i2);
            }
            c6765kpOooO00o.m26792k4("$");
            return c6765kpOooO00o.toString();
        }

        /* JADX INFO: renamed from: kk */
        public final void m60196kk(AbstractC12945di abstractC12945di) {
            m60180k4(abstractC12945di, 4, "The MaxLength constraining facet is prohibited for '{0}'.");
            m60183x1(abstractC12945di, 4, "This is a duplicate MaxLength constraining facet.");
            this.f43513x1.f43446kk = AbstractC12972ev.m60484x1(((C14046bv) C7019kk.m27464to(m60176k4(this.f43507h4, abstractC12945di, "The MaxLength constraining facet is invalid - {0}", null, null), C14046bv.class)).Clone());
            if ((this.f43512to & 4) != 0) {
                AbstractC13279x6 abstractC13279x6 = this.f43509k4;
                if (!abstractC13279x6.mo60031k4(Integer.valueOf(abstractC13279x6.mo60033up().f43446kk), Integer.valueOf(this.f43513x1.f43446kk))) {
                    throw new XmlSchemaException("Values that are declared as {fixed} in a base type can not be changed in a derived type.", abstractC12945di);
                }
            }
            if ((this.f43510kk & 4) != 0 && this.f43509k4.mo60033up().f43446kk < this.f43513x1.f43446kk) {
                throw new XmlSchemaException("It is an error if 'maxLength' is among the members of {facets} of {base type definition} and {value} is greater than the {value} of the parent 'maxLength'.", abstractC12945di);
            }
            if ((this.f43510kk & 1) != 0 && this.f43509k4.mo60033up().f43445k4 > this.f43513x1.f43446kk) {
                throw new XmlSchemaException("It is an error for both 'length' and either 'minLength' or 'maxLength' to be members of {facets}, unless they are specified in different derivation steps. In which case the following must be true: the {value} of 'minLength' <= the {value} of 'length' <= the {value} of 'maxLength'.", abstractC12945di);
            }
            m60179k4(abstractC12945di, 4);
        }

        /* JADX INFO: renamed from: to */
        public final void m60198to(AbstractC12945di abstractC12945di) {
            int i;
            m60180k4(abstractC12945di, 32, "The WhiteSpace constraining facet is prohibited for '{0}'.");
            m60183x1(abstractC12945di, 32, "This is a duplicate WhiteSpace constraining facet.");
            if ("preserve".equals(abstractC12945di.m60233k4())) {
                this.f43513x1.f43443h4 = 0;
            } else if ("replace".equals(abstractC12945di.m60233k4())) {
                this.f43513x1.f43443h4 = 1;
            } else {
                if (!"collapse".equals(abstractC12945di.m60233k4())) {
                    throw new XmlSchemaException("The white space character, '{0}', is invalid.", abstractC12945di.m60233k4(), abstractC12945di);
                }
                this.f43513x1.f43443h4 = 2;
            }
            if ((this.f43512to & 32) != 0) {
                AbstractC13279x6 abstractC13279x6 = this.f43509k4;
                if (!abstractC13279x6.mo60031k4(Integer.valueOf(abstractC13279x6.mo60033up().f43443h4), Integer.valueOf(this.f43513x1.f43443h4))) {
                    throw new XmlSchemaException("Values that are declared as {fixed} in a base type can not be changed in a derived type.", abstractC12945di);
                }
            }
            int iMo60021ix = (this.f43510kk & 32) != 0 ? this.f43509k4.mo60033up().f43443h4 : this.f43509k4.mo60021ix();
            if (iMo60021ix == 2 && ((i = this.f43513x1.f43443h4) == 1 || i == 0)) {
                throw new XmlSchemaException("It is an error if 'whiteSpace' is among the members of {facets} of {base type definition}, {value} is 'replace' or 'preserve', and the {value} of the parent 'whiteSpace' is 'collapse'.", abstractC12945di);
            }
            if (iMo60021ix == 1 && this.f43513x1.f43443h4 == 0) {
                throw new XmlSchemaException("It is an error if 'whiteSpace' is among the members of {facets} of {base type definition}, {value} is 'preserve', and the {value} of the parent 'whiteSpace' is 'replace'.", abstractC12945di);
            }
            m60179k4(abstractC12945di, 32);
        }

        /* JADX INFO: renamed from: x1 */
        public final void m60200x1(AbstractC12945di abstractC12945di) {
            m60180k4(abstractC12945di, 2, "The MinLength constraining facet is prohibited for '{0}'.");
            m60183x1(abstractC12945di, 2, "This is a duplicate MinLength constraining facet.");
            this.f43513x1.f43450x1 = AbstractC12972ev.m60484x1(((C14046bv) C7019kk.m27464to(m60176k4(this.f43507h4, abstractC12945di, "The MinLength constraining facet is invalid - {0}", null, null), C14046bv.class)).Clone());
            if ((this.f43512to & 2) != 0) {
                AbstractC13279x6 abstractC13279x6 = this.f43509k4;
                if (!abstractC13279x6.mo60031k4(Integer.valueOf(abstractC13279x6.mo60033up().f43450x1), Integer.valueOf(this.f43513x1.f43450x1))) {
                    throw new XmlSchemaException("Values that are declared as {fixed} in a base type can not be changed in a derived type.", abstractC12945di);
                }
            }
            if ((this.f43510kk & 2) != 0 && this.f43509k4.mo60033up().f43450x1 > this.f43513x1.f43450x1) {
                throw new XmlSchemaException("It is an error if 'minLength' is among the members of {facets} of {base type definition} and {value} is less than the {value} of the parent 'minLength'.", abstractC12945di);
            }
            if ((this.f43510kk & 1) != 0 && this.f43509k4.mo60033up().f43445k4 < this.f43513x1.f43450x1) {
                throw new XmlSchemaException("It is an error for both 'length' and either 'minLength' or 'maxLength' to be members of {facets}, unless they are specified in different derivation steps. In which case the following must be true: the {value} of 'minLength' <= the {value} of 'length' <= the {value} of 'maxLength'.", abstractC12945di);
            }
            m60179k4(abstractC12945di, 2);
        }

        /* JADX INFO: renamed from: x1 */
        private void m60183x1(AbstractC12945di abstractC12945di, int i, String str) {
            if ((i & this.f43513x1.f43449up) != 0) {
                throw new XmlSchemaException(str, abstractC12945di);
            }
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m60184x1(k4 k4Var) {
            return C14067j2.m66728k4(k4Var.f43509k4, this.f43509k4) && C14067j2.m66728k4(k4Var.f43513x1, this.f43513x1) && k4Var.f43510kk == this.f43510kk && k4Var.f43512to == this.f43512to && k4Var.f43505du == this.f43505du && C14067j2.m66728k4(k4Var.f43507h4, this.f43507h4) && C14067j2.m66728k4(k4Var.f43511m9, this.f43511m9) && k4Var.f43506dy == this.f43506dy && k4Var.f43503c5 == this.f43503c5 && C14067j2.m66728k4(k4Var.f43508jd, this.f43508jd) && C14067j2.m66728k4(k4Var.f43504ck, this.f43504ck);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m60190k4() {
            if (this.f43503c5) {
                return;
            }
            C12909bg c12909bg = this.f43513x1;
            if (c12909bg.f43448to == null) {
                c12909bg.f43448to = new ArrayList();
            }
            try {
                this.f43508jd.m26792k4(")");
                if (C14113y2.m67429to(this.f43508jd.toString(), '|') != -1) {
                    this.f43508jd.m26786k4(0, "(");
                    this.f43508jd.m26792k4(")");
                }
                this.f43513x1.f43448to.addItem(new C12380dy(m60177k4(this.f43508jd.toString()), 0));
            } catch (RuntimeException e) {
                throw new XmlSchemaException("The Pattern constraining facet is invalid - {0}", new String[]{e.getMessage()}, e, this.f43504ck.m60693xk(), this.f43504ck.m60676ak(), this.f43504ck.m60678dq(), this.f43504ck);
            }
        }

        /* JADX INFO: renamed from: k4 */
        private void m60178k4(int i) {
            C12909bg c12909bg = this.f43513x1;
            c12909bg.f43449up |= i;
            if ((this.f43512to & i) != 0) {
                c12909bg.f43451yj = i | c12909bg.f43451yj;
            }
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(k4 k4Var) {
            if (k4Var == null) {
                k4Var = new k4();
            }
            k4Var.f43509k4 = this.f43509k4;
            k4Var.f43513x1 = this.f43513x1;
            k4Var.f43510kk = this.f43510kk;
            k4Var.f43512to = this.f43512to;
            k4Var.f43505du = this.f43505du;
            k4Var.f43507h4 = this.f43507h4;
            k4Var.f43511m9 = this.f43511m9;
            k4Var.f43506dy = this.f43506dy;
            k4Var.f43503c5 = this.f43503c5;
            k4Var.f43508jd = this.f43508jd;
            k4Var.f43504ck = this.f43504ck;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m60192k4(AbstractC12945di abstractC12945di) {
            m60180k4(abstractC12945di, 1, "The length constraining facet is prohibited for '{0}'.");
            m60183x1(abstractC12945di, 1, "This is a duplicate Length constraining facet.");
            this.f43513x1.f43445k4 = AbstractC12972ev.m60484x1(((C14046bv) C7019kk.m27464to(m60176k4(this.f43507h4, abstractC12945di, "The Length constraining facet is invalid - {0}", null, null), C14046bv.class)).Clone());
            if ((this.f43512to & 1) != 0) {
                AbstractC13279x6 abstractC13279x6 = this.f43509k4;
                if (!abstractC13279x6.mo60031k4(Integer.valueOf(abstractC13279x6.mo60033up().f43445k4), Integer.valueOf(this.f43513x1.f43445k4))) {
                    throw new XmlSchemaException("Values that are declared as {fixed} in a base type can not be changed in a derived type.", abstractC12945di);
                }
            }
            if ((this.f43510kk & 1) != 0 && this.f43509k4.mo60033up().f43445k4 < this.f43513x1.f43445k4) {
                throw new XmlSchemaException("It is an error if 'length' is among the members of {facets} of {base type definition} and {value} is greater than the {value} of the parent 'length'.", abstractC12945di);
            }
            if ((this.f43510kk & 2) != 0 && this.f43509k4.mo60033up().f43450x1 > this.f43513x1.f43445k4) {
                throw new XmlSchemaException("It is an error for both 'length' and either 'minLength' or 'maxLength' to be members of {facets}, unless they are specified in different derivation steps. In which case the following must be true: the {value} of 'minLength' <= the {value} of 'length' <= the {value} of 'maxLength'.", abstractC12945di);
            }
            if ((this.f43510kk & 4) != 0 && this.f43509k4.mo60033up().f43446kk < this.f43513x1.f43445k4) {
                throw new XmlSchemaException("It is an error for both 'length' and either 'minLength' or 'maxLength' to be members of {facets}, unless they are specified in different derivation steps. In which case the following must be true: the {value} of 'minLength' <= the {value} of 'length' <= the {value} of 'maxLength'.", abstractC12945di);
            }
            m60179k4(abstractC12945di, 1);
        }

        /* JADX INFO: renamed from: k4 */
        private void m60179k4(AbstractC12945di abstractC12945di, int i) {
            this.f43513x1.f43449up |= i;
            if (abstractC12945di.m60237x1()) {
                C12909bg c12909bg = this.f43513x1;
                c12909bg.f43451yj = i | c12909bg.f43451yj;
            }
        }

        /* JADX INFO: renamed from: k4 */
        private void m60180k4(AbstractC12945di abstractC12945di, int i, String str) {
            if ((i & this.f43505du) == 0) {
                throw new XmlSchemaException(str, this.f43509k4.m60015ar(), abstractC12945di);
            }
        }

        /* JADX INFO: renamed from: k4 */
        public final void m60193k4(AbstractC12945di abstractC12945di, InterfaceC13980t6 interfaceC13980t6, AbstractC13883dt abstractC13883dt) {
            m60180k4(abstractC12945di, 16, "The Enumeration constraining facet is prohibited for '{0}'.");
            C12909bg c12909bg = this.f43513x1;
            if (c12909bg.f43440du == null) {
                c12909bg.f43440du = new ArrayList();
            }
            this.f43513x1.f43440du.addItem(m60176k4(this.f43509k4, abstractC12945di, "The Enumeration constraining facet is invalid - {0}", interfaceC13980t6, abstractC13883dt));
            m60179k4(abstractC12945di, 16);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m60194k4(C13090lv c13090lv) {
            m60180k4(c13090lv, 8, "The Pattern constraining facet is prohibited for '{0}'.");
            if (this.f43503c5) {
                C6765kp c6765kp = new C6765kp();
                this.f43508jd = c6765kp;
                c6765kp.m26792k4("(");
                this.f43508jd.m26792k4(c13090lv.m60233k4());
                this.f43504ck = c13090lv;
                this.f43503c5 = false;
            } else {
                this.f43508jd.m26792k4(")|(");
                this.f43508jd.m26792k4(c13090lv.m60233k4());
            }
            m60179k4(c13090lv, 8);
        }

        /* JADX INFO: renamed from: k4 */
        private void m60181k4(Object obj, AbstractC12945di abstractC12945di) {
            C12909bg c12909bgMo60033up = this.f43509k4.mo60033up();
            switch (abstractC12945di.m60232h4()) {
                case 7:
                    if ((this.f43510kk & 512) != 0 && this.f43509k4.mo60034x1(obj, c12909bgMo60033up.f43444jd) < 0) {
                        throw new XmlSchemaException("It is an error if the derived 'minExclusive' facet value is less than the parent 'minExclusive' facet value.", C14113y2.f47374k4);
                    }
                    if ((this.f43510kk & 256) != 0 && this.f43509k4.mo60034x1(obj, c12909bgMo60033up.f43438c5) < 0) {
                        throw new XmlSchemaException("It is an error if the derived 'minExclusive' facet value is less than or equal to the parent 'minInclusive' facet value.", C14113y2.f47374k4);
                    }
                    if ((this.f43510kk & 128) != 0 && this.f43509k4.mo60034x1(obj, c12909bgMo60033up.f43441dy) >= 0) {
                        throw new XmlSchemaException("It is an error if the derived 'minExclusive' facet value is greater than or equal to the parent 'maxExclusive' facet value.", C14113y2.f47374k4);
                    }
                    return;
                case 8:
                    if ((this.f43510kk & 256) != 0 && this.f43509k4.mo60034x1(obj, c12909bgMo60033up.f43438c5) < 0) {
                        throw new XmlSchemaException("It is an error if the derived 'minInclusive' facet value is less than the parent 'minInclusive' facet value.", C14113y2.f47374k4);
                    }
                    if ((this.f43510kk & 512) != 0 && this.f43509k4.mo60034x1(obj, c12909bgMo60033up.f43444jd) < 0) {
                        throw new XmlSchemaException("It is an error if the derived 'minInclusive' facet value is less than or equal to the parent 'minExclusive' facet value.", C14113y2.f47374k4);
                    }
                    if ((this.f43510kk & 128) != 0 && this.f43509k4.mo60034x1(obj, c12909bgMo60033up.f43441dy) >= 0) {
                        throw new XmlSchemaException("It is an error if the derived 'minInclusive' facet value is greater than or equal to the parent 'maxExclusive' facet value.", C14113y2.f47374k4);
                    }
                    return;
                case 9:
                    if ((this.f43510kk & 128) != 0 && this.f43509k4.mo60034x1(obj, c12909bgMo60033up.f43441dy) > 0) {
                        throw new XmlSchemaException("It is an error if the derived 'maxExclusive' facet value is greater than the parent 'maxExclusive' facet value.", C14113y2.f47374k4);
                    }
                    if ((this.f43510kk & 64) != 0 && this.f43509k4.mo60034x1(obj, c12909bgMo60033up.f43447m9) > 0) {
                        throw new XmlSchemaException("It is an error if the derived 'maxExclusive' facet value is greater than or equal to the parent 'maxInclusive' facet value.", C14113y2.f47374k4);
                    }
                    return;
                case 10:
                    if ((this.f43510kk & 64) != 0 && this.f43509k4.mo60034x1(obj, c12909bgMo60033up.f43447m9) > 0) {
                        throw new XmlSchemaException("It is an error if the derived 'maxInclusive' facet value is greater than the parent 'maxInclusive' facet value.", C14113y2.f47374k4);
                    }
                    if ((this.f43510kk & 128) != 0 && this.f43509k4.mo60034x1(obj, c12909bgMo60033up.f43441dy) >= 0) {
                        throw new XmlSchemaException("It is an error if the derived 'maxInclusive' facet value is greater than or equal to the parent 'maxExclusive' facet value.", C14113y2.f47374k4);
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final Exception m60162k4(C12909bg c12909bg, String str) {
        if (c12909bg == null || (c12909bg.f43449up & 8) == 0) {
            return null;
        }
        for (int i = 0; i < c12909bg.f43448to.size(); i++) {
            if (!((C12380dy) c12909bg.f43448to.get_Item(i)).m57988to(str)) {
                return new XmlSchemaException("The Pattern constraint failed.", C14113y2.f47374k4);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public RuntimeException mo60174x1(C14084qq c14084qq, AbstractC12892ae abstractC12892ae) {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public Exception mo60163k4(C13890ei c13890ei, AbstractC12892ae abstractC12892ae) {
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public RuntimeException mo60131x1(Object obj, AbstractC12892ae abstractC12892ae) {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public Exception mo60164k4(C14077m4 c14077m4, AbstractC12892ae abstractC12892ae) {
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public RuntimeException mo60132x1(byte[] bArr, AbstractC12892ae abstractC12892ae) {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public C12909bg m60165k4(AbstractC13279x6 abstractC13279x6, C12908be c12908be, AbstractC13883dt abstractC13883dt) {
        C12909bg c12909bg = new C12909bg();
        k4 k4Var = new k4(abstractC13279x6, c12909bg);
        for (int i = 0; i < c12908be.size(); i++) {
            AbstractC12945di abstractC12945di = (AbstractC12945di) c12908be.get_Item(i);
            if (abstractC12945di.m60233k4() == null) {
                throw new XmlSchemaException("The 'value' attribute must be present in facet.", abstractC12945di);
            }
            C13270wt c13270wt = new C13270wt(abstractC12945di);
            switch (abstractC12945di.m60232h4()) {
                case 1:
                    k4Var.m60192k4(abstractC12945di);
                    break;
                case 2:
                    k4Var.m60200x1(abstractC12945di);
                    break;
                case 3:
                    k4Var.m60196kk(abstractC12945di);
                    break;
                case 4:
                    k4Var.m60194k4((C13090lv) C7019kk.m27452k4((Object) abstractC12945di, C13090lv.class));
                    break;
                case 5:
                    k4Var.m60198to(abstractC12945di);
                    break;
                case 6:
                    k4Var.m60193k4(abstractC12945di, c13270wt, abstractC13883dt);
                    break;
                case 7:
                    k4Var.m60187dy(abstractC12945di);
                    break;
                case 8:
                    k4Var.m60197m9(abstractC12945di);
                    break;
                case 9:
                    k4Var.m60188h4(abstractC12945di);
                    break;
                case 10:
                    k4Var.m60186du(abstractC12945di);
                    break;
                case 11:
                    k4Var.m60185c5(abstractC12945di);
                    break;
                case 12:
                    k4Var.m60189jd(abstractC12945di);
                    break;
                default:
                    throw new XmlSchemaException("This is an unknown facet.", abstractC12945di);
            }
        }
        k4Var.m60190k4();
        k4Var.m60199x1();
        return c12909bg;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m60175x1(String[] strArr, AbstractC12892ae abstractC12892ae) {
        C12909bg c12909bgMo60033up = abstractC12892ae.mo60033up();
        int iMo60017ck = abstractC12892ae.mo60017ck();
        if (iMo60017ck != 0) {
            if (iMo60017ck != 1) {
                return;
            }
            strArr[0] = C14113y2.m67440x1(strArr[0]);
            return;
        }
        if (abstractC12892ae.mo60021ix() == 2) {
            strArr[0] = C13969rq.m65820k4(strArr[0]);
            return;
        }
        if (abstractC12892ae.mo60021ix() == 1) {
            strArr[0] = C13969rq.m65822x1(strArr[0]);
            return;
        }
        if (c12909bgMo60033up == null || (c12909bgMo60033up.f43449up & 32) == 0) {
            return;
        }
        int i = c12909bgMo60033up.f43443h4;
        if (i == 1) {
            strArr[0] = C13969rq.m65822x1(strArr[0]);
        } else if (i == 2) {
            strArr[0] = C13969rq.m65820k4(strArr[0]);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C14046bv m60161k4(int i, int i2) {
        C14046bv c14046bvM66527x1 = new C14046bv("1").Clone();
        C14046bv c14046bvM66527x12 = C7019kk.m27440jd(Integer.valueOf(i), 9).Clone();
        if (i2 > 28) {
            return C14046bv.f47170x1;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C14046bv.m66451du(c14046bvM66527x1, c14046bvM66527x12).CloneTo(c14046bvM66527x1);
        }
        return c14046bvM66527x1;
    }

    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60166k4(double d, AbstractC12892ae abstractC12892ae) {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60167k4(float f, AbstractC12892ae abstractC12892ae) {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60168k4(int i, AbstractC12892ae abstractC12892ae) {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60169k4(long j, AbstractC12892ae abstractC12892ae) {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60170k4(C14046bv c14046bv, AbstractC12892ae abstractC12892ae) {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60171k4(String str, AbstractC12892ae abstractC12892ae) {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60172k4(short s, AbstractC12892ae abstractC12892ae) {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public RuntimeException m60173k4(String[] strArr, AbstractC12892ae abstractC12892ae) {
        m60175x1(strArr, abstractC12892ae);
        return m60162k4(abstractC12892ae.mo60033up(), strArr[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo60130k4(Object obj, ArrayList arrayList, AbstractC12892ae abstractC12892ae) {
        return false;
    }
}
