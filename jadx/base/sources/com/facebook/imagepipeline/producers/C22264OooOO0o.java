package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.imagepipeline.producers.C22264OooOO0o;
import com.facebook.imagepipeline.producers.C22277OooOooO;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import o00o0Ooo.C25428OooO0o;
import o00o0o.AbstractC25434OooO00o;
import o00o0o.C25435OooO0O0;
import o00o0o00.C25438OooO00o;
import o00o0o0o.InterfaceC25443OooO00o;
import o00o0oOo.C25458OooO00o;
import o00o0oOo.C25461OooO0Oo;
import o00oOoO.InterfaceC25615OooO00o;
import o00oOoOo.C25622OooO0O0;
import o00oOoOo.C25623OooO0OO;
import o00oo.C25638OooO0oO;
import o00oo.InterfaceC25636OooO0Oo;
import o00oo.InterfaceC25637OooO0o0;
import o00oo.InterfaceC25640OooOO0o;
import o00oo0O.C25651OooO00o;
import o00oo0O.C25654OooO0Oo;
import o00oo0Oo.C25685OooO00o;
import o00oo0Oo.EnumC25696OooOOO;
import o00oo0oO.C25725OooO00o;
import o00oo0oO.C25730OooO0o0;
import o00oo0oO.InterfaceC25727OooO0OO;
import o00oo0oO.InterfaceC25728OooO0Oo;
import o00ooO.C25732OooO0O0;
import o00ooO0o.C25763OooO00o;
import o00ooO0o.C25764OooO0O0;
import o00ooOO.C25767OooO0OO;
import o00ooOO0.C25772OooO00o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22264OooOO0o implements InterfaceC22291OoooO0O<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C25685OooO00o f67307OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25443OooO00o f67308OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f67309OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC25727OooO0OO f67310OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC25728OooO0Oo f67311OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f67312OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final EnumC25696OooOOO f67313OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC22291OoooO0O<C25638OooO0oO> f67314OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f67315OooO0oo;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOO0o$OooO00o */
    public final class OooO00o extends OooO0OO {
        @Override // com.facebook.imagepipeline.producers.C22264OooOO0o.OooO0OO
        public final InterfaceC25640OooOO0o OooOOO() {
            o00oo.OooOO0O oooOO0O = new o00oo.OooOO0O();
            oooOO0O.f87513OooO00o = 0;
            oooOO0O.f87514OooO0O0 = false;
            oooOO0O.f87515OooO0OO = false;
            return oooOO0O;
        }

        @Override // com.facebook.imagepipeline.producers.C22264OooOO0o.OooO0OO
        public final int OooOOO0(C25638OooO0oO encodedImage) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(encodedImage, "encodedImage");
            return encodedImage.OooOooo();
        }

        @Override // com.facebook.imagepipeline.producers.C22264OooOO0o.OooO0OO
        public final synchronized boolean OooOo00(C25638OooO0oO c25638OooO0oO, int i) {
            return com.facebook.imagepipeline.producers.OooO0O0.OooO0o0(i) ? false : this.f67324OooO0oo.OooO0o0(c25638OooO0oO, i);
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOO0o$OooO0O0 */
    public final class OooO0O0 extends OooO0OO {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final C25730OooO0o0 f67316OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final InterfaceC25728OooO0Oo f67317OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C22264OooOO0o c22264OooOO0o, OooO consumer, InterfaceC22288OoooO interfaceC22288OoooO, C25730OooO0o0 c25730OooO0o0, InterfaceC25728OooO0Oo progressiveJpegConfig, int i) {
            super(c22264OooOO0o, consumer, interfaceC22288OoooO, i);
            kotlin.jvm.internal.OooOOO0.OooO0oO(consumer, "consumer");
            kotlin.jvm.internal.OooOOO0.OooO0oO(progressiveJpegConfig, "progressiveJpegConfig");
            this.f67316OooOO0O = c25730OooO0o0;
            this.f67317OooOO0o = progressiveJpegConfig;
            this.f67318OooO = 0;
        }

        @Override // com.facebook.imagepipeline.producers.C22264OooOO0o.OooO0OO
        public final InterfaceC25640OooOO0o OooOOO() {
            return this.f67317OooOO0o.OooO0O0(this.f67316OooOO0O.f87820OooO0o0);
        }

        @Override // com.facebook.imagepipeline.producers.C22264OooOO0o.OooO0OO
        public final int OooOOO0(C25638OooO0oO encodedImage) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(encodedImage, "encodedImage");
            return this.f67316OooOO0O.f87819OooO0o;
        }

        @Override // com.facebook.imagepipeline.producers.C22264OooOO0o.OooO0OO
        public final synchronized boolean OooOo00(C25638OooO0oO c25638OooO0oO, int i) {
            if (c25638OooO0oO == null) {
                return false;
            }
            try {
                boolean zOooO0o0 = this.f67324OooO0oo.OooO0o0(c25638OooO0oO, i);
                if (com.facebook.imagepipeline.producers.OooO0O0.OooO0o0(i) || com.facebook.imagepipeline.producers.OooO0O0.OooOO0O(i, 8)) {
                    if (!com.facebook.imagepipeline.producers.OooO0O0.OooOO0O(i, 4) && C25638OooO0oO.Oooo0OO(c25638OooO0oO)) {
                        c25638OooO0oO.ooOO();
                        if (c25638OooO0oO.f87501OooOo == C25622OooO0O0.f87441OooO00o) {
                            if (!this.f67316OooOO0O.OooO0O0(c25638OooO0oO)) {
                                return false;
                            }
                            int i2 = this.f67316OooOO0O.f87820OooO0o0;
                            int i3 = this.f67318OooO;
                            if (i2 <= i3) {
                                return false;
                            }
                            if (i2 < this.f67317OooOO0o.OooO00o(i3) && !this.f67316OooOO0O.f87821OooO0oO) {
                                return false;
                            }
                            this.f67318OooO = i2;
                        }
                    }
                }
                return zOooO0o0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOO0o$OooO0OO */
    public abstract class OooO0OO extends OooOOOO<C25638OooO0oO, AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f67318OooO;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final InterfaceC22288OoooO f67319OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f67320OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final C25651OooO00o f67321OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o000oOoO f67322OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f67323OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final C22277OooOooO f67324OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ C22264OooOO0o f67325OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(final C22264OooOO0o c22264OooOO0o, OooO consumer, InterfaceC22288OoooO interfaceC22288OoooO, final int i) {
            super(consumer);
            kotlin.jvm.internal.OooOOO0.OooO0oO(consumer, "consumer");
            this.f67325OooOO0 = c22264OooOO0o;
            this.f67319OooO0OO = interfaceC22288OoooO;
            this.f67320OooO0Oo = "ProgressiveDecoder";
            this.f67322OooO0o0 = interfaceC22288OoooO.OooOOo0();
            C25651OooO00o c25651OooO00o = interfaceC22288OoooO.OooOOoo().f87914OooO0o;
            kotlin.jvm.internal.OooOOO0.OooO0o(c25651OooO00o, "getImageDecodeOptions(...)");
            this.f67321OooO0o = c25651OooO00o;
            this.f67324OooO0oo = new C22277OooOooO(c22264OooOO0o.f67309OooO0O0, new C22277OooOooO.OooO00o() { // from class: com.facebook.imagepipeline.producers.OooOOO0
                /* JADX WARN: Type inference failed for: r2v3, types: [byte[], java.lang.StringBuilder] */
                @Override // com.facebook.imagepipeline.producers.C22277OooOooO.OooO00o
                public final void OooO00o(C25638OooO0oO c25638OooO0oO, int i2) {
                    boolean z;
                    long j;
                    long j2;
                    C22264OooOO0o.OooO0OO oooO0OO;
                    InterfaceC25636OooO0Oo interfaceC25636OooO0Oo;
                    C25638OooO0oO c25638OooO0oO2;
                    C22264OooOO0o.OooO0OO this$0 = this.f67327OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                    C22264OooOO0o this$1 = c22264OooOO0o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(this$1, "this$1");
                    if (c25638OooO0oO != null) {
                        InterfaceC22288OoooO interfaceC22288OoooO2 = this$0.f67319OooO0OO;
                        C25763OooO00o c25763OooO00oOooOOoo = interfaceC22288OoooO2.OooOOoo();
                        c25638OooO0oO.ooOO();
                        interfaceC22288OoooO2.Oooo000(c25638OooO0oO.f87501OooOo.f87456OooO00o, "image_format");
                        Uri uri = c25763OooO00oOooOOoo.f87911OooO0O0;
                        c25638OooO0oO.f87510Oooo000 = uri != null ? uri.toString() : null;
                        EnumC25696OooOOO enumC25696OooOOO = this$1.f67313OooO0o0;
                        boolean zOooOO0O = OooO0O0.OooOO0O(i2, 16);
                        if ((enumC25696OooOOO == EnumC25696OooOOO.f87666OooOo0o || (enumC25696OooOOO == EnumC25696OooOOO.f87665OooOo && !zOooOO0O)) && (this$1.f67312OooO0o || !C25461OooO0Oo.OooO0OO(c25763OooO00oOooOOoo.f87911OooO0O0))) {
                            C25654OooO0Oo c25654OooO0Oo = c25763OooO00oOooOOoo.f87916OooO0oO;
                            kotlin.jvm.internal.OooOOO0.OooO0o(c25654OooO0Oo, "getRotationOptions(...)");
                            c25638OooO0oO.f87506OooOoo = C25772OooO00o.OooO00o(c25654OooO0Oo, c25638OooO0oO, i);
                        }
                        interfaceC22288OoooO2.OooOOO0().OooO0O0().getClass();
                        int i3 = this$0.f67318OooO;
                        c25638OooO0oO.ooOO();
                        if ((c25638OooO0oO.f87501OooOo == C25622OooO0O0.f87441OooO00o || !OooO0O0.OooO0o0(i2)) && !this$0.f67323OooO0oO && C25638OooO0oO.Oooo0OO(c25638OooO0oO)) {
                            c25638OooO0oO.ooOO();
                            boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(c25638OooO0oO.f87501OooOo, C25622OooO0O0.f87443OooO0OO);
                            o000oOoO o000oooo2 = this$0.f67322OooO0o0;
                            if (zOooO0O0) {
                                c25638OooO0oO.ooOO();
                                long j3 = c25638OooO0oO.f87505OooOoOO;
                                c25638OooO0oO.ooOO();
                                long j4 = c25638OooO0oO.f87507OooOoo0;
                                C25651OooO00o c25651OooO00o2 = this$0.f67321OooO0o;
                                if (j3 * j4 * ((long) C25767OooO0OO.OooO0O0(c25651OooO00o2.f87563OooO00o)) > 104857600) {
                                    c25638OooO0oO.ooOO();
                                    int i4 = c25638OooO0oO.f87505OooOoOO;
                                    c25638OooO0oO.ooOO();
                                    int i5 = c25638OooO0oO.f87507OooOoo0;
                                    ?? byteArray = ByteArrayOutputStream.toByteArray();
                                    byteArray.append(c25651OooO00o2.f87563OooO00o);
                                    byteArray.append(", max bitmap size = 104857600");
                                    IllegalStateException illegalStateException = new IllegalStateException(byteArray.toString());
                                    o000oooo2.OooOO0O(interfaceC22288OoooO2, "DecodeProducer", illegalStateException, null);
                                    this$0.OooOOOO(illegalStateException);
                                    return;
                                }
                            }
                            c25638OooO0oO.ooOO();
                            C25623OooO0OO c25623OooO0OO = c25638OooO0oO.f87501OooOo;
                            kotlin.jvm.internal.OooOOO0.OooO0o(c25623OooO0OO, "getImageFormat(...)");
                            String str = c25623OooO0OO.f87456OooO00o;
                            c25638OooO0oO.ooOO();
                            int i6 = c25638OooO0oO.f87505OooOoOO;
                            c25638OooO0oO.ooOO();
                            String str2 = i6 + "x" + c25638OooO0oO.f87507OooOoo0;
                            String strValueOf = String.valueOf(c25638OooO0oO.f87506OooOoo);
                            boolean zOooO0Oo = OooO0O0.OooO0Oo(i2);
                            boolean z2 = zOooO0Oo && !OooO0O0.OooOO0O(i2, 8);
                            boolean zOooOO0O2 = OooO0O0.OooOO0O(i2, 4);
                            interfaceC22288OoooO2.OooOOoo().getClass();
                            try {
                                C22277OooOooO c22277OooOooO = this$0.f67324OooO0oo;
                                synchronized (c22277OooOooO) {
                                    z = z2;
                                    j = c22277OooOooO.f67373OooO - c22277OooOooO.f67381OooO0oo;
                                }
                                String string = interfaceC22288OoooO2.OooOOoo().f87911OooO0O0.toString();
                                kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                                int iOooOooo = (z || zOooOO0O2) ? c25638OooO0oO.OooOooo() : this$0.OooOOO0(c25638OooO0oO);
                                InterfaceC25640OooOO0o interfaceC25640OooOO0oOooOOO = (z || zOooOO0O2) ? o00oo.OooOO0O.f87512OooO0Oo : this$0.OooOOO();
                                o000oooo2.OooO0OO(interfaceC22288OoooO2, "DecodeProducer");
                                try {
                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC25640OooOO0oOooOOO);
                                    InterfaceC25636OooO0Oo interfaceC25636OooO0OoOooOOo0 = this$0.OooOOo0(c25638OooO0oO, iOooOooo, interfaceC25640OooOO0oOooOOO);
                                    try {
                                        int i7 = c25638OooO0oO.f87506OooOoo != 1 ? i2 | 16 : i2;
                                        o000oooo2.OooO(interfaceC22288OoooO2, "DecodeProducer", this$0.OooOO0o(interfaceC25636OooO0OoOooOOo0, j, interfaceC25640OooOO0oOooOOO, zOooO0Oo, str, str2, strValueOf));
                                        this$0.OooOOoo(c25638OooO0oO, interfaceC25636OooO0OoOooOOo0, i3);
                                        this$0.OooOOOo(interfaceC25636OooO0OoOooOOo0, i7);
                                        c25638OooO0oO.close();
                                    } catch (Exception e) {
                                        e = e;
                                        j2 = j;
                                        interfaceC25636OooO0Oo = interfaceC25636OooO0OoOooOOo0;
                                        oooO0OO = this$0;
                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC25640OooOO0oOooOOO);
                                        C22264OooOO0o.OooO0OO oooO0OO2 = oooO0OO;
                                        o000oooo2.OooOO0O(interfaceC22288OoooO2, "DecodeProducer", e, oooO0OO2.OooOO0o(interfaceC25636OooO0Oo, j2, interfaceC25640OooOO0oOooOOO, zOooO0Oo, str, str2, strValueOf));
                                        oooO0OO2.OooOOOO(e);
                                        c25638OooO0oO.close();
                                    }
                                } catch (C25725OooO00o e2) {
                                    j2 = j;
                                    try {
                                        c25638OooO0oO2 = e2.f87808OooOo0o;
                                    } catch (Exception e3) {
                                        e = e3;
                                    }
                                    try {
                                        oooO0OO = this$0;
                                    } catch (Exception e4) {
                                        e = e4;
                                        oooO0OO = this$0;
                                        interfaceC25636OooO0Oo = null;
                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC25640OooOO0oOooOOO);
                                        C22264OooOO0o.OooO0OO oooO0OO22 = oooO0OO;
                                        o000oooo2.OooOO0O(interfaceC22288OoooO2, "DecodeProducer", e, oooO0OO22.OooOO0o(interfaceC25636OooO0Oo, j2, interfaceC25640OooOO0oOooOOO, zOooO0Oo, str, str2, strValueOf));
                                        oooO0OO22.OooOOOO(e);
                                        c25638OooO0oO.close();
                                    }
                                    try {
                                        C25438OooO00o.OooOO0(this$0.f67320OooO0Oo, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e2.getMessage(), string, c25638OooO0oO2.OooOOo0(), Integer.valueOf(c25638OooO0oO2.OooOooo()));
                                        throw e2;
                                    } catch (Exception e5) {
                                        e = e5;
                                        interfaceC25636OooO0Oo = null;
                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC25640OooOO0oOooOOO);
                                        C22264OooOO0o.OooO0OO oooO0OO222 = oooO0OO;
                                        o000oooo2.OooOO0O(interfaceC22288OoooO2, "DecodeProducer", e, oooO0OO222.OooOO0o(interfaceC25636OooO0Oo, j2, interfaceC25640OooOO0oOooOOO, zOooO0Oo, str, str2, strValueOf));
                                        oooO0OO222.OooOOOO(e);
                                        c25638OooO0oO.close();
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    j2 = j;
                                    oooO0OO = this$0;
                                    interfaceC25636OooO0Oo = null;
                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC25640OooOO0oOooOOO);
                                    C22264OooOO0o.OooO0OO oooO0OO2222 = oooO0OO;
                                    o000oooo2.OooOO0O(interfaceC22288OoooO2, "DecodeProducer", e, oooO0OO2222.OooOO0o(interfaceC25636OooO0Oo, j2, interfaceC25640OooOO0oOooOOO, zOooO0Oo, str, str2, strValueOf));
                                    oooO0OO2222.OooOOOO(e);
                                    c25638OooO0oO.close();
                                }
                            } catch (Throwable th) {
                                c25638OooO0oO.close();
                                throw th;
                            }
                        }
                    }
                }
            });
            interfaceC22288OoooO.OooO0OO(new OooOOO(this));
        }

        @Override // com.facebook.imagepipeline.producers.OooOOOO, com.facebook.imagepipeline.producers.OooO0O0
        public final void OooO(float f) {
            super.OooO(f * 0.99f);
        }

        @Override // com.facebook.imagepipeline.producers.OooOOOO, com.facebook.imagepipeline.producers.OooO0O0
        public final void OooO0o() {
            OooOOo(true);
            this.f67330OooO0O0.OooO0O0();
        }

        @Override // com.facebook.imagepipeline.producers.OooOOOO, com.facebook.imagepipeline.producers.OooO0O0
        public final void OooO0oO(Throwable t) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(t, "t");
            OooOOOO(t);
        }

        @Override // com.facebook.imagepipeline.producers.OooO0O0
        public final void OooO0oo(int i, Object obj) {
            C25638OooO0oO c25638OooO0oO = (C25638OooO0oO) obj;
            C25732OooO0O0.OooO00o();
            boolean zOooO0Oo = com.facebook.imagepipeline.producers.OooO0O0.OooO0Oo(i);
            InterfaceC22288OoooO interfaceC22288OoooO = this.f67319OooO0OO;
            if (zOooO0Oo) {
                if (c25638OooO0oO == null) {
                    kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC22288OoooO.o00Oo0("cached_value_found"), Boolean.TRUE);
                    interfaceC22288OoooO.OooOOO0().OooO0O0().getClass();
                    OooOOOO(new C25458OooO00o("Encoded image is null."));
                    return;
                } else if (!c25638OooO0oO.Oooo0()) {
                    OooOOOO(new C25458OooO00o("Encoded image is not valid."));
                    return;
                }
            }
            if (OooOo00(c25638OooO0oO, i)) {
                boolean zOooOO0O = com.facebook.imagepipeline.producers.OooO0O0.OooOO0O(i, 4);
                if (zOooO0Oo || zOooOO0O || interfaceC22288OoooO.Oooo0OO()) {
                    this.f67324OooO0oo.OooO0OO();
                }
            }
        }

        public final C25428OooO0o OooOO0o(InterfaceC25636OooO0Oo interfaceC25636OooO0Oo, long j, InterfaceC25640OooOO0o interfaceC25640OooOO0o, boolean z, String str, String str2, String str3) {
            Map<String, Object> extras;
            Object obj;
            String string = null;
            if (!this.f67322OooO0o0.OooO0Oo(this.f67319OooO0OO, "DecodeProducer")) {
                return null;
            }
            String strValueOf = String.valueOf(j);
            String strValueOf2 = String.valueOf(((o00oo.OooOO0O) interfaceC25640OooOO0o).f87514OooO0O0);
            String strValueOf3 = String.valueOf(z);
            if (interfaceC25636OooO0Oo != null && (extras = interfaceC25636OooO0Oo.getExtras()) != null && (obj = extras.get("non_fatal_decode_error")) != null) {
                string = obj.toString();
            }
            if (!(interfaceC25636OooO0Oo instanceof InterfaceC25637OooO0o0)) {
                String str4 = string;
                HashMap map = new HashMap(7);
                map.put("queueTime", strValueOf);
                map.put("hasGoodQuality", strValueOf2);
                map.put("isFinal", strValueOf3);
                map.put("encodedImageSize", str2);
                map.put("imageFormat", str);
                map.put("requestedImageSize", "unknown");
                map.put("sampleSize", str3);
                if (str4 != null) {
                    map.put("non_fatal_decode_error", str4);
                }
                return new C25428OooO0o(map);
            }
            String str5 = string;
            Bitmap bitmapO000Ooo = ((InterfaceC25637OooO0o0) interfaceC25636OooO0Oo).o000Ooo();
            kotlin.jvm.internal.OooOOO0.OooO0o(bitmapO000Ooo, "getUnderlyingBitmap(...)");
            String str6 = bitmapO000Ooo.getWidth() + "x" + bitmapO000Ooo.getHeight();
            HashMap map2 = new HashMap(8);
            map2.put("bitmapSize", str6);
            map2.put("queueTime", strValueOf);
            map2.put("hasGoodQuality", strValueOf2);
            map2.put("isFinal", strValueOf3);
            map2.put("encodedImageSize", str2);
            map2.put("imageFormat", str);
            map2.put("requestedImageSize", "unknown");
            map2.put("sampleSize", str3);
            int byteCount = bitmapO000Ooo.getByteCount();
            StringBuilder sb = new StringBuilder();
            sb.append(byteCount);
            map2.put("byteCount", sb.toString());
            if (str5 != null) {
                map2.put("non_fatal_decode_error", str5);
            }
            return new C25428OooO0o(map2);
        }

        public abstract InterfaceC25640OooOO0o OooOOO();

        public abstract int OooOOO0(C25638OooO0oO c25638OooO0oO);

        public final void OooOOOO(Throwable th) {
            OooOOo(true);
            this.f67330OooO0O0.onFailure(th);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void OooOOOo(InterfaceC25636OooO0Oo interfaceC25636OooO0Oo, int i) {
            C25685OooO00o.C19715OooO00o c19715OooO00o = this.f67325OooOO0.f67307OooO.f87633OooO00o;
            C25435OooO0O0 c25435OooO0O0 = null;
            if (interfaceC25636OooO0Oo != null) {
                AbstractC25434OooO00o.C19703OooO00o c19703OooO00o = AbstractC25434OooO00o.f86710OooOoOO;
                c19715OooO00o.OooO0O0();
                boolean z = interfaceC25636OooO0Oo instanceof Bitmap;
                c25435OooO0O0 = new C25435OooO0O0(interfaceC25636OooO0Oo, c19703OooO00o, c19715OooO00o, null, true);
            }
            try {
                OooOOo(com.facebook.imagepipeline.producers.OooO0O0.OooO0Oo(i));
                this.f67330OooO0O0.OooO00o(i, c25435OooO0O0);
            } finally {
                AbstractC25434OooO00o.OooOooo(c25435OooO0O0);
            }
        }

        public final void OooOOo(boolean z) {
            C25638OooO0oO c25638OooO0oO;
            synchronized (this) {
                if (z) {
                    if (!this.f67323OooO0oO) {
                        this.f67330OooO0O0.OooO0OO(1.0f);
                        this.f67323OooO0oO = true;
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        C22277OooOooO c22277OooOooO = this.f67324OooO0oo;
                        synchronized (c22277OooOooO) {
                            c25638OooO0oO = c22277OooOooO.f67379OooO0o0;
                            c22277OooOooO.f67379OooO0o0 = null;
                            c22277OooOooO.f67378OooO0o = 0;
                        }
                        C25638OooO0oO.OooO0OO(c25638OooO0oO);
                    }
                }
            }
        }

        public final InterfaceC25636OooO0Oo OooOOo0(C25638OooO0oO c25638OooO0oO, int i, InterfaceC25640OooOO0o interfaceC25640OooOO0o) {
            C22264OooOO0o c22264OooOO0o = this.f67325OooOO0;
            c22264OooOO0o.getClass();
            return c22264OooOO0o.f67310OooO0OO.OooO00o(c25638OooO0oO, i, interfaceC25640OooOO0o, this.f67321OooO0o);
        }

        public final void OooOOoo(C25638OooO0oO c25638OooO0oO, InterfaceC25636OooO0Oo interfaceC25636OooO0Oo, int i) {
            c25638OooO0oO.ooOO();
            Object objValueOf = Integer.valueOf(c25638OooO0oO.f87505OooOoOO);
            InterfaceC25615OooO00o interfaceC25615OooO00o = this.f67319OooO0OO;
            interfaceC25615OooO00o.Oooo000(objValueOf, "encoded_width");
            c25638OooO0oO.ooOO();
            interfaceC25615OooO00o.Oooo000(Integer.valueOf(c25638OooO0oO.f87507OooOoo0), "encoded_height");
            interfaceC25615OooO00o.Oooo000(Integer.valueOf(c25638OooO0oO.OooOooo()), "encoded_size");
            c25638OooO0oO.ooOO();
            interfaceC25615OooO00o.Oooo000(c25638OooO0oO.f87509OooOooo, "image_color_space");
            if (interfaceC25636OooO0Oo instanceof o00oo.OooO0OO) {
                interfaceC25615OooO00o.Oooo000(String.valueOf(((o00oo.OooO0OO) interfaceC25636OooO0Oo).o000Ooo().getConfig()), "bitmap_config");
            }
            if (interfaceC25636OooO0Oo != null) {
                interfaceC25636OooO0Oo.OooOooo(interfaceC25615OooO00o.getExtras());
            }
            interfaceC25615OooO00o.Oooo000(Integer.valueOf(i), "last_scan_num");
        }

        public abstract boolean OooOo00(C25638OooO0oO c25638OooO0oO, int i);
    }

    public C22264OooOO0o(InterfaceC25443OooO00o byteArrayPool, Executor executor, InterfaceC25727OooO0OO imageDecoder, InterfaceC25728OooO0Oo progressiveJpegConfig, EnumC25696OooOOO downsampleMode, boolean z, InterfaceC22291OoooO0O inputProducer, int i, C25685OooO00o closeableReferenceFactory) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(byteArrayPool, "byteArrayPool");
        kotlin.jvm.internal.OooOOO0.OooO0oO(executor, "executor");
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageDecoder, "imageDecoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(progressiveJpegConfig, "progressiveJpegConfig");
        kotlin.jvm.internal.OooOOO0.OooO0oO(downsampleMode, "downsampleMode");
        kotlin.jvm.internal.OooOOO0.OooO0oO(inputProducer, "inputProducer");
        kotlin.jvm.internal.OooOOO0.OooO0oO(closeableReferenceFactory, "closeableReferenceFactory");
        this.f67308OooO00o = byteArrayPool;
        this.f67309OooO0O0 = executor;
        this.f67310OooO0OO = imageDecoder;
        this.f67311OooO0Oo = progressiveJpegConfig;
        this.f67313OooO0o0 = downsampleMode;
        this.f67312OooO0o = z;
        this.f67314OooO0oO = inputProducer;
        this.f67315OooO0oo = i;
        this.f67307OooO = closeableReferenceFactory;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> consumer, InterfaceC22288OoooO context) {
        C22264OooOO0o c22264OooOO0o;
        InterfaceC22288OoooO interfaceC22288OoooO;
        OooO<C25638OooO0oO> oooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(consumer, "consumer");
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        C25732OooO0O0.OooO00o();
        C25763OooO00o c25763OooO00oOooOOoo = context.OooOOoo();
        if (C25461OooO0Oo.OooO0OO(c25763OooO00oOooOOoo.f87911OooO0O0) || C25764OooO0O0.OooO0Oo(c25763OooO00oOooOOoo.f87911OooO0O0)) {
            c22264OooOO0o = this;
            interfaceC22288OoooO = context;
            oooO0O0 = new OooO0O0(c22264OooOO0o, consumer, interfaceC22288OoooO, new C25730OooO0o0(this.f67308OooO00o), this.f67311OooO0Oo, this.f67315OooO0oo);
        } else {
            oooO0O0 = new OooO00o(this, consumer, context, this.f67315OooO0oo);
            c22264OooOO0o = this;
            interfaceC22288OoooO = context;
        }
        c22264OooOO0o.f67314OooO0oO.OooO00o(oooO0O0, interfaceC22288OoooO);
    }
}
