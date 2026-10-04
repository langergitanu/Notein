package com.bumptech.glide;

import OooOo.OooO00o;
import Oooo0oO.o0Oo0oo;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import androidx.fragment.app.C21929Ooooo0o;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00OooO.AbstractC25133OooOO0o;
import o00o00Oo.C25270OooOOOo;
import o00o00oO.AbstractC25285OooO00o;
import o00o00oO.C25284OooO;
import o00o00oO.C25286OooO0O0;
import o00o00oO.C25291OooO0oO;
import o00o00oO.C25292OooO0oo;
import o00o00oO.InterfaceC25288OooO0Oo;
import o00o00oO.InterfaceC25289OooO0o;
import o00o00oO.InterfaceC25290OooO0o0;
import o00o00oo.C25295OooO0O0;
import o00o00oo.C25297OooO0Oo;
import o00o00oo.C25300OooO0oO;
import o00o00oo.InterfaceC25293OooO;
import o00o0O0.C25316OooOO0o;
import o00o0O00.C25317OooO00o;
import o00o0O00.C25318OooO0O0;
import o00o0O00.C25320OooO0Oo;

/* JADX INFO: renamed from: com.bumptech.glide.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C22253OooOO0o<TranscodeType> extends AbstractC25285OooO00o<C22253OooOO0o<TranscodeType>> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Context f67142Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public OooOOO<?, ? super TranscodeType> f67143OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final Class<TranscodeType> f67144OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final OooOOO0 f67145OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final OooO0o f67146OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public Object f67147OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public C22253OooOO0o<TranscodeType> f67148OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public C22253OooOO0o<TranscodeType> f67149OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final boolean f67150OoooOo0 = true;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f67151OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f67152OoooOoo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public ArrayList f67153o000oOoO;

    /* JADX INFO: renamed from: com.bumptech.glide.OooOO0o$OooO00o */
    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f67154OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f67155OooO0O0;

        static {
            int[] iArr = new int[EnumC22252OooO0oo.values().length];
            f67155OooO0O0 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67155OooO0O0[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67155OooO0O0[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67155OooO0O0[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f67154OooO00o = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67154OooO00o[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67154OooO00o[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f67154OooO00o[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f67154OooO00o[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f67154OooO00o[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f67154OooO00o[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f67154OooO00o[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        ((C25291OooO0oO) new C25291OooO0oO().OooO0oO(AbstractC25133OooOO0o.f85489OooO0O0).OooOo0o()).OooOoo(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C22253OooOO0o(OooO0OO oooO0OO, OooOOO0 oooOOO0, Class<TranscodeType> cls, Context context) {
        C25291OooO0oO c25291OooO0oO;
        this.f67145OoooO00 = oooOOO0;
        this.f67144OoooO0 = cls;
        this.f67142Oooo = context;
        OooOo.OooO00o oooO00o = oooOOO0.f67158OooOo0o.f67116OooOoO0.f67126OooO0o;
        OooOOO<?, ? super TranscodeType> oooOOO = (OooOOO) oooO00o.get(cls);
        if (oooOOO == null) {
            for (Map.Entry entry : (OooO00o.C18962OooO00o) oooO00o.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    oooOOO = (OooOOO) entry.getValue();
                }
            }
        }
        this.f67143OoooO = oooOOO == null ? OooO0o.f67120OooOO0O : oooOOO;
        this.f67146OoooO0O = oooO0OO.f67116OooOoO0;
        Iterator<InterfaceC25289OooO0o<Object>> it = oooOOO0.f67165OooOooo.iterator();
        while (it.hasNext()) {
            Oooo0o((InterfaceC25289OooO0o) it.next());
        }
        synchronized (oooOOO0) {
            c25291OooO0oO = oooOOO0.f67166Oooo000;
        }
        OooO00o(c25291OooO0oO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC25288OooO0Oo Oooo(Object obj, InterfaceC25293OooO interfaceC25293OooO, InterfaceC25290OooO0o0 interfaceC25290OooO0o0, OooOOO oooOOO, EnumC22252OooO0oo enumC22252OooO0oo, int i, int i2, AbstractC25285OooO00o abstractC25285OooO00o) {
        InterfaceC25290OooO0o0 interfaceC25290OooO0o02;
        InterfaceC25290OooO0o0 c25286OooO0O0;
        InterfaceC25290OooO0o0 interfaceC25290OooO0o03;
        AbstractC25285OooO00o abstractC25285OooO00o2;
        InterfaceC25288OooO0Oo c25292OooO0oo;
        EnumC22252OooO0oo enumC22252OooO0oo2;
        if (this.f67149OoooOOo != null) {
            c25286OooO0O0 = new C25286OooO0O0(obj, interfaceC25290OooO0o0);
            interfaceC25290OooO0o02 = c25286OooO0O0;
        } else {
            interfaceC25290OooO0o02 = null;
            c25286OooO0O0 = interfaceC25290OooO0o0;
        }
        C22253OooOO0o<TranscodeType> c22253OooOO0o = this.f67148OoooOOO;
        if (c22253OooOO0o == null) {
            interfaceC25290OooO0o03 = interfaceC25290OooO0o02;
            Object obj2 = this.f67147OoooOO0;
            ArrayList arrayList = this.f67153o000oOoO;
            OooO0o oooO0o = this.f67146OoooO0O;
            o00OooO.OooOOO0 oooOOO0 = oooO0o.f67128OooO0oO;
            oooOOO.getClass();
            abstractC25285OooO00o2 = abstractC25285OooO00o;
            c25292OooO0oo = new C25292OooO0oo(this.f67142Oooo, oooO0o, obj, obj2, this.f67144OoooO0, abstractC25285OooO00o2, i, i2, enumC22252OooO0oo, interfaceC25293OooO, arrayList, c25286OooO0O0, oooOOO0);
        } else {
            if (this.f67152OoooOoo) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            OooOOO oooOOO2 = c22253OooOO0o.f67150OoooOo0 ? oooOOO : c22253OooOO0o.f67143OoooO;
            if (AbstractC25285OooO00o.OooOO0o(c22253OooOO0o.f86047OooOo0o, 8)) {
                enumC22252OooO0oo2 = this.f67148OoooOOO.f86049OooOoO0;
            } else {
                int iOrdinal = enumC22252OooO0oo.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    enumC22252OooO0oo2 = EnumC22252OooO0oo.f67134OooOo0o;
                } else if (iOrdinal == 2) {
                    enumC22252OooO0oo2 = EnumC22252OooO0oo.f67133OooOo;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f86049OooOoO0);
                    }
                    enumC22252OooO0oo2 = EnumC22252OooO0oo.f67136OooOoO0;
                }
            }
            EnumC22252OooO0oo enumC22252OooO0oo3 = enumC22252OooO0oo2;
            C22253OooOO0o<TranscodeType> c22253OooOO0o2 = this.f67148OoooOOO;
            int i3 = c22253OooOO0o2.f86053OooOooO;
            int i4 = c22253OooOO0o2.f86051OooOoo;
            if (C25316OooOO0o.OooO(i, i2)) {
                C22253OooOO0o<TranscodeType> c22253OooOO0o3 = this.f67148OoooOOO;
                if (!C25316OooOO0o.OooO(c22253OooOO0o3.f86053OooOooO, c22253OooOO0o3.f86051OooOoo)) {
                    i3 = abstractC25285OooO00o.f86053OooOooO;
                    i4 = abstractC25285OooO00o.f86051OooOoo;
                }
            }
            int i5 = i4;
            int i6 = i3;
            C25284OooO c25284OooO = new C25284OooO(obj, c25286OooO0O0);
            Object obj3 = this.f67147OoooOO0;
            ArrayList arrayList2 = this.f67153o000oOoO;
            OooO0o oooO0o2 = this.f67146OoooO0O;
            o00OooO.OooOOO0 oooOOO02 = oooO0o2.f67128OooO0oO;
            oooOOO.getClass();
            C25284OooO c25284OooO2 = c25284OooO;
            interfaceC25290OooO0o03 = interfaceC25290OooO0o02;
            C25292OooO0oo c25292OooO0oo2 = new C25292OooO0oo(this.f67142Oooo, oooO0o2, obj, obj3, this.f67144OoooO0, abstractC25285OooO00o, i, i2, enumC22252OooO0oo, interfaceC25293OooO, arrayList2, c25284OooO2, oooOOO02);
            this.f67152OoooOoo = true;
            C22253OooOO0o<TranscodeType> c22253OooOO0o4 = this.f67148OoooOOO;
            InterfaceC25288OooO0Oo interfaceC25288OooO0OoOooo = c22253OooOO0o4.Oooo(obj, interfaceC25293OooO, c25284OooO2, oooOOO2, enumC22252OooO0oo3, i6, i5, c22253OooOO0o4);
            this.f67152OoooOoo = false;
            c25284OooO2.f86041OooO0OO = c25292OooO0oo2;
            c25284OooO2.f86042OooO0Oo = interfaceC25288OooO0OoOooo;
            abstractC25285OooO00o2 = abstractC25285OooO00o;
            c25292OooO0oo = c25284OooO2;
        }
        if (interfaceC25290OooO0o03 == null) {
            return c25292OooO0oo;
        }
        C22253OooOO0o<TranscodeType> c22253OooOO0o5 = this.f67149OoooOOo;
        int i7 = c22253OooOO0o5.f86053OooOooO;
        int i8 = c22253OooOO0o5.f86051OooOoo;
        if (C25316OooOO0o.OooO(i, i2)) {
            C22253OooOO0o<TranscodeType> c22253OooOO0o6 = this.f67149OoooOOo;
            if (!C25316OooOO0o.OooO(c22253OooOO0o6.f86053OooOooO, c22253OooOO0o6.f86051OooOoo)) {
                i7 = abstractC25285OooO00o2.f86053OooOooO;
                i8 = abstractC25285OooO00o2.f86051OooOoo;
            }
        }
        int i9 = i8;
        C22253OooOO0o<TranscodeType> c22253OooOO0o7 = this.f67149OoooOOo;
        C25286OooO0O0 c25286OooO0O02 = interfaceC25290OooO0o03;
        InterfaceC25288OooO0Oo interfaceC25288OooO0OoOooo2 = c22253OooOO0o7.Oooo(obj, interfaceC25293OooO, c25286OooO0O02, c22253OooOO0o7.f67143OoooO, c22253OooOO0o7.f86049OooOoO0, i7, i9, c22253OooOO0o7);
        c25286OooO0O02.f86067OooO0OO = c25292OooO0oo;
        c25286OooO0O02.f86068OooO0Oo = interfaceC25288OooO0OoOooo2;
        return c25286OooO0O02;
    }

    public C22253OooOO0o<TranscodeType> Oooo0o(InterfaceC25289OooO0o<TranscodeType> interfaceC25289OooO0o) {
        if (this.f86061Oooo0o) {
            return clone().Oooo0o(interfaceC25289OooO0o);
        }
        if (interfaceC25289OooO0o != null) {
            if (this.f67153o000oOoO == null) {
                this.f67153o000oOoO = new ArrayList();
            }
            this.f67153o000oOoO.add(interfaceC25289OooO0o);
        }
        OooOoO();
        return this;
    }

    @Override // o00o00oO.AbstractC25285OooO00o
    /* JADX INFO: renamed from: Oooo0oO, reason: merged with bridge method [inline-methods] */
    public C22253OooOO0o<TranscodeType> OooO00o(AbstractC25285OooO00o<?> abstractC25285OooO00o) {
        C21929Ooooo0o.OooO0O0(abstractC25285OooO00o);
        return (C22253OooOO0o) super.OooO00o(abstractC25285OooO00o);
    }

    public final C22253OooOO0o<TranscodeType> Oooo0oo(C22253OooOO0o<TranscodeType> c22253OooOO0o) {
        PackageInfo packageInfo;
        Context context = this.f67142Oooo;
        C22253OooOO0o<TranscodeType> c22253OooOO0oOooOooO = c22253OooOO0o.OooOooO(context.getTheme());
        ConcurrentHashMap concurrentHashMap = C25318OooO0O0.f86165OooO00o;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = C25318OooO0O0.f86165OooO00o;
        InterfaceC25116OooO0o interfaceC25116OooO0o = (InterfaceC25116OooO0o) concurrentHashMap2.get(packageName);
        if (interfaceC25116OooO0o == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
                packageInfo = null;
            }
            C25320OooO0Oo c25320OooO0Oo = new C25320OooO0Oo(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            InterfaceC25116OooO0o interfaceC25116OooO0o2 = (InterfaceC25116OooO0o) concurrentHashMap2.putIfAbsent(packageName, c25320OooO0Oo);
            interfaceC25116OooO0o = interfaceC25116OooO0o2 == null ? c25320OooO0Oo : interfaceC25116OooO0o2;
        }
        return c22253OooOO0oOooOooO.OooOoo0(new C25317OooO00o(context.getResources().getConfiguration().uiMode & 48, interfaceC25116OooO0o));
    }

    public C22253OooOO0o<TranscodeType> OoooO(InterfaceC25289OooO0o<TranscodeType> interfaceC25289OooO0o) {
        if (this.f86061Oooo0o) {
            return clone().OoooO(interfaceC25289OooO0o);
        }
        this.f67153o000oOoO = null;
        return Oooo0o(interfaceC25289OooO0o);
    }

    public final void OoooO0(ImageView imageView) {
        AbstractC25285OooO00o abstractC25285OooO00oOooOOO;
        InterfaceC25293OooO c25297OooO0Oo;
        C25316OooOO0o.OooO00o();
        C21929Ooooo0o.OooO0O0(imageView);
        if (!AbstractC25285OooO00o.OooOO0o(this.f86047OooOo0o, 2048) && this.f86057Oooo00O && imageView.getScaleType() != null) {
            switch (OooO00o.f67154OooO00o[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC25285OooO00oOooOOO = clone().OooOOO();
                    break;
                case 2:
                    abstractC25285OooO00oOooOOO = clone().OooOOOO();
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC25285OooO00oOooOOO = clone().OooOOOo();
                    break;
                case 6:
                    abstractC25285OooO00oOooOOO = clone().OooOOOO();
                    break;
                default:
                    abstractC25285OooO00oOooOOO = this;
                    break;
            }
        } else {
            abstractC25285OooO00oOooOOO = this;
        }
        this.f67146OoooO0O.f67124OooO0OO.getClass();
        Class<TranscodeType> cls = this.f67144OoooO0;
        if (Bitmap.class.equals(cls)) {
            c25297OooO0Oo = new C25295OooO0O0(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(o0Oo0oo.OooO0OO("Unhandled class: ", cls, ", try .as*(Class).transcode(ResourceTranscoder)"));
            }
            c25297OooO0Oo = new C25297OooO0Oo(imageView);
        }
        OoooO0O(c25297OooO0Oo, abstractC25285OooO00oOooOOO);
    }

    @Override // o00o00oO.AbstractC25285OooO00o
    /* JADX INFO: renamed from: OoooO00, reason: merged with bridge method [inline-methods] */
    public C22253OooOO0o<TranscodeType> clone() {
        C22253OooOO0o<TranscodeType> c22253OooOO0o = (C22253OooOO0o) super.clone();
        c22253OooOO0o.f67143OoooO = c22253OooOO0o.f67143OoooO.clone();
        if (c22253OooOO0o.f67153o000oOoO != null) {
            c22253OooOO0o.f67153o000oOoO = new ArrayList(c22253OooOO0o.f67153o000oOoO);
        }
        C22253OooOO0o<TranscodeType> c22253OooOO0o2 = c22253OooOO0o.f67148OoooOOO;
        if (c22253OooOO0o2 != null) {
            c22253OooOO0o.f67148OoooOOO = c22253OooOO0o2.clone();
        }
        C22253OooOO0o<TranscodeType> c22253OooOO0o3 = c22253OooOO0o.f67149OoooOOo;
        if (c22253OooOO0o3 != null) {
            c22253OooOO0o.f67149OoooOOo = c22253OooOO0o3.clone();
        }
        return c22253OooOO0o;
    }

    public final void OoooO0O(InterfaceC25293OooO interfaceC25293OooO, AbstractC25285OooO00o abstractC25285OooO00o) {
        C21929Ooooo0o.OooO0O0(interfaceC25293OooO);
        if (!this.f67151OoooOoO) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC25288OooO0Oo interfaceC25288OooO0OoOooo = Oooo(new Object(), interfaceC25293OooO, null, this.f67143OoooO, abstractC25285OooO00o.f86049OooOoO0, abstractC25285OooO00o.f86053OooOooO, abstractC25285OooO00o.f86051OooOoo, abstractC25285OooO00o);
        InterfaceC25288OooO0Oo request = interfaceC25293OooO.getRequest();
        if (interfaceC25288OooO0OoOooo.OooO0o(request) && (abstractC25285OooO00o.f86052OooOoo0 || !request.OooO0o0())) {
            C21929Ooooo0o.OooO0OO(request, "Argument must not be null");
            if (request.isRunning()) {
                return;
            }
            request.OooO();
            return;
        }
        this.f67145OoooO00.OooO0Oo(interfaceC25293OooO);
        interfaceC25293OooO.setRequest(interfaceC25288OooO0OoOooo);
        OooOOO0 oooOOO0 = this.f67145OoooO00;
        synchronized (oooOOO0) {
            oooOOO0.f67163OooOoo0.f86021OooOo0o.add(interfaceC25293OooO);
            C25270OooOOOo c25270OooOOOo = oooOOO0.f67159OooOoO;
            c25270OooOOOo.f86005OooO00o.add(interfaceC25288OooO0OoOooo);
            if (c25270OooOOOo.f86007OooO0OO) {
                interfaceC25288OooO0OoOooo.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                c25270OooOOOo.f86006OooO0O0.add(interfaceC25288OooO0OoOooo);
            } else {
                interfaceC25288OooO0OoOooo.OooO();
            }
        }
    }

    public C22253OooOO0o<TranscodeType> OoooOO0(Drawable drawable) {
        return OoooOoo(drawable).OooO00o(new C25291OooO0oO().OooO0oO(AbstractC25133OooOO0o.f85488OooO00o));
    }

    public C22253OooOO0o<TranscodeType> OoooOOO(File file) {
        return OoooOoo(file);
    }

    public C22253OooOO0o<TranscodeType> OoooOOo(Integer num) {
        return Oooo0oo(OoooOoo(num));
    }

    public C22253OooOO0o<TranscodeType> OoooOo0(Object obj) {
        return OoooOoo(obj);
    }

    public C22253OooOO0o<TranscodeType> OoooOoO(String str) {
        return OoooOoo(str);
    }

    public final C22253OooOO0o<TranscodeType> OoooOoo(Object obj) {
        if (this.f86061Oooo0o) {
            return clone().OoooOoo(obj);
        }
        this.f67147OoooOO0 = obj;
        this.f67151OoooOoO = true;
        OooOoO();
        return this;
    }

    public final void Ooooo00() {
        OoooO0O(new C25300OooO0oO(this.f67145OoooO00), this);
    }

    public C22253OooOO0o<TranscodeType> Ooooo0o(C22253OooOO0o<TranscodeType> c22253OooOO0o) {
        if (this.f86061Oooo0o) {
            return clone().Ooooo0o(c22253OooOO0o);
        }
        this.f67148OoooOOO = c22253OooOO0o;
        OooOoO();
        return this;
    }

    public C22253OooOO0o<TranscodeType> OooooO0(List<C22253OooOO0o<TranscodeType>> list) {
        C22253OooOO0o<TranscodeType> c22253OooOO0oOoooo0o = null;
        if (list.isEmpty()) {
            return Ooooo0o(null);
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            C22253OooOO0o<TranscodeType> c22253OooOO0o = list.get(size);
            if (c22253OooOO0o != null) {
                c22253OooOO0oOoooo0o = c22253OooOO0oOoooo0o == null ? c22253OooOO0o : c22253OooOO0o.Ooooo0o(c22253OooOO0oOoooo0o);
            }
        }
        return Ooooo0o(c22253OooOO0oOoooo0o);
    }

    @Override // o00o00oO.AbstractC25285OooO00o
    public final boolean equals(Object obj) {
        if (!(obj instanceof C22253OooOO0o)) {
            return false;
        }
        C22253OooOO0o c22253OooOO0o = (C22253OooOO0o) obj;
        if (super.equals(c22253OooOO0o)) {
            return Objects.equals(this.f67144OoooO0, c22253OooOO0o.f67144OoooO0) && this.f67143OoooO.equals(c22253OooOO0o.f67143OoooO) && Objects.equals(this.f67147OoooOO0, c22253OooOO0o.f67147OoooOO0) && Objects.equals(this.f67153o000oOoO, c22253OooOO0o.f67153o000oOoO) && Objects.equals(this.f67148OoooOOO, c22253OooOO0o.f67148OoooOOO) && Objects.equals(this.f67149OoooOOo, c22253OooOO0o.f67149OoooOOo) && this.f67150OoooOo0 == c22253OooOO0o.f67150OoooOo0 && this.f67151OoooOoO == c22253OooOO0o.f67151OoooOoO;
        }
        return false;
    }

    @Override // o00o00oO.AbstractC25285OooO00o
    public final int hashCode() {
        return C25316OooOO0o.OooO0oO(this.f67151OoooOoO ? 1 : 0, C25316OooOO0o.OooO0oO(this.f67150OoooOo0 ? 1 : 0, C25316OooOO0o.OooO0oo(C25316OooOO0o.OooO0oo(C25316OooOO0o.OooO0oo(C25316OooOO0o.OooO0oo(C25316OooOO0o.OooO0oo(C25316OooOO0o.OooO0oo(C25316OooOO0o.OooO0oo(super.hashCode(), this.f67144OoooO0), this.f67143OoooO), this.f67147OoooOO0), this.f67153o000oOoO), this.f67148OoooOOO), this.f67149OoooOOo), null)));
    }

    public C22253OooOO0o<TranscodeType> o000oOoO(Uri uri) {
        C22253OooOO0o<TranscodeType> c22253OooOO0oOoooOoo = OoooOoo(uri);
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? c22253OooOO0oOoooOoo : Oooo0oo(c22253OooOO0oOoooOoo);
    }
}
