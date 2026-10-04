package com.orion.notein.domain.models;

import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.miui.penengine.p596e.C18773h;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m80612d2 = {"Lcom/orion/notein/domain/models/LocaleCountryCode;", "", "name", "", "code", "letter", C18773h.f57233c, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getCode", "getLetter", "getH", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class LocaleCountryCode {
    private final String code;
    private final boolean h;
    private final String letter;
    private final String name;

    public LocaleCountryCode() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ LocaleCountryCode copy$default(LocaleCountryCode localeCountryCode, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localeCountryCode.name;
        }
        if ((i & 2) != 0) {
            str2 = localeCountryCode.code;
        }
        if ((i & 4) != 0) {
            str3 = localeCountryCode.letter;
        }
        if ((i & 8) != 0) {
            z = localeCountryCode.h;
        }
        return localeCountryCode.copy(str, str2, str3, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLetter() {
        return this.letter;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getH() {
        return this.h;
    }

    public final LocaleCountryCode copy(String name, String code, String letter, boolean h) {
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(code, "code");
        OooOOO0.OooO0oO(letter, "letter");
        return new LocaleCountryCode(name, code, letter, h);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocaleCountryCode)) {
            return false;
        }
        LocaleCountryCode localeCountryCode = (LocaleCountryCode) other;
        return OooOOO0.OooO0O0(this.name, localeCountryCode.name) && OooOOO0.OooO0O0(this.code, localeCountryCode.code) && OooOOO0.OooO0O0(this.letter, localeCountryCode.letter) && this.h == localeCountryCode.h;
    }

    public final String getCode() {
        return this.code;
    }

    public final boolean getH() {
        return this.h;
    }

    public final String getLetter() {
        return this.letter;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Boolean.hashCode(this.h) + OooO00o.OooO0O0(OooO00o.OooO0O0(this.name.hashCode() * 31, 31, this.code), 31, this.letter);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.code;
        String str3 = this.letter;
        boolean z = this.h;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("LocaleCountryCode(name=", str, ", code=", str2, ", letter=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", h=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public LocaleCountryCode(String name, String code, String letter, boolean z) {
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(code, "code");
        OooOOO0.OooO0oO(letter, "letter");
        this.name = name;
        this.code = code;
        this.letter = letter;
        this.h = z;
    }

    public /* synthetic */ LocaleCountryCode(String str, String str2, String str3, boolean z, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z);
    }
}
