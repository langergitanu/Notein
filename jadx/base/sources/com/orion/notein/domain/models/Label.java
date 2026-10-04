package com.orion.notein.domain.models;

import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import Oooo0.o000000O;
import Oooo00o.OooO0OO;
import android.content.Context;
import android.text.SpannableString;
import androidx.core.content.ContextCompat;
import com.aspose.slides.C22205OooOOo;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import p000.OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001/BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rB\t\b\u0016¢\u0006\u0004\b\f\u0010\u000eJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003JE\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0007HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00060"}, m80612d2 = {"Lcom/orion/notein/domain/models/Label;", "", "id", "", "name", "", "color", "", "createdTime", "modifiedTime", FirebaseAnalytics.Param.INDEX, "", "<init>", "(JLjava/lang/String;IJJF)V", "()V", "getId", "()J", "setId", "(J)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getColor", "()I", "setColor", "(I)V", "getCreatedTime", "setCreatedTime", "getModifiedTime", "setModifiedTime", "getIndex", "()F", "setIndex", "(F)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class Label {
    public static final float DEFAULT_BACKGROUND_ALPHA = 0.24f;
    private int color;
    private long createdTime;
    private long id;
    private float index;
    private long modifiedTime;
    private String name;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int DEFAULT_PADDING = o000000O.OooO0o(7);

    @Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007J\u001a\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0002J\u001a\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/notein/domain/models/Label$Companion;", "", "<init>", "()V", "DEFAULT_BACKGROUND_ALPHA", "", "DEFAULT_PADDING", "", "getDEFAULT_PADDING", "()I", "formatSpannableString", "Landroid/text/SpannableString;", "context", "Landroid/content/Context;", "name", "", "color", "blendWithBlack", "alpha", "blendWithWhite", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        private final int blendWithBlack(int color, float alpha) {
            float f = 1 - alpha;
            return ((int) ((30 * f) + ((color & 255) * alpha))) | (-16777216) | (((int) ((28 * f) + (((color >> 16) & 255) * alpha))) << 16) | (((int) ((28 * f) + (((color >> 8) & 255) * alpha))) << 8);
        }

        public static /* synthetic */ int blendWithBlack$default(Companion companion, int i, float f, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.24f;
            }
            return companion.blendWithBlack(i, f);
        }

        private final int blendWithWhite(int color, float alpha) {
            float f = (1 - alpha) * 255;
            return ((int) (((color & 255) * alpha) + f)) | (-16777216) | (((int) ((((color >> 16) & 255) * alpha) + f)) << 16) | (((int) ((((color >> 8) & 255) * alpha) + f)) << 8);
        }

        public static /* synthetic */ int blendWithWhite$default(Companion companion, int i, float f, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.24f;
            }
            return companion.blendWithWhite(i, f);
        }

        public final SpannableString formatSpannableString(Context context, String name, int color) {
            OooOOO0.OooO0oO(context, "context");
            OooOOO0.OooO0oO(name, "name");
            SpannableString spannableString = new SpannableString(name);
            if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
                blendWithBlack$default(Label.INSTANCE, color, 0.0f, 2, null);
            } else {
                blendWithWhite$default(Label.INSTANCE, color, 0.0f, 2, null);
            }
            ContextCompat.getColor(context, R.color.notein_label_secondary);
            Label.INSTANCE.getDEFAULT_PADDING();
            spannableString.setSpan(new OooO00o(), 0, spannableString.length(), 33);
            return spannableString;
        }

        public final int getDEFAULT_PADDING() {
            return Label.DEFAULT_PADDING;
        }

        private Companion() {
        }
    }

    public Label(long j, String name, int i, long j2, long j3, float f) {
        OooOOO0.OooO0oO(name, "name");
        this.id = j;
        this.name = name;
        this.color = i;
        this.createdTime = j2;
        this.modifiedTime = j3;
        this.index = f;
    }

    public static /* synthetic */ Label copy$default(Label label, long j, String str, int i, long j2, long j3, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = label.id;
        }
        long j4 = j;
        if ((i2 & 2) != 0) {
            str = label.name;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            i = label.color;
        }
        return label.copy(j4, str2, i, (i2 & 8) != 0 ? label.createdTime : j2, (i2 & 16) != 0 ? label.modifiedTime : j3, (i2 & 32) != 0 ? label.index : f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCreatedTime() {
        return this.createdTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getIndex() {
        return this.index;
    }

    public final Label copy(long id, String name, int color, long createdTime, long modifiedTime, float index) {
        OooOOO0.OooO0oO(name, "name");
        return new Label(id, name, color, createdTime, modifiedTime, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Label)) {
            return false;
        }
        Label label = (Label) other;
        return this.id == label.id && OooOOO0.OooO0O0(this.name, label.name) && this.color == label.color && this.createdTime == label.createdTime && this.modifiedTime == label.modifiedTime && Float.compare(this.index, label.index) == 0;
    }

    public final int getColor() {
        return this.color;
    }

    public final long getCreatedTime() {
        return this.createdTime;
    }

    public final long getId() {
        return this.id;
    }

    public final float getIndex() {
        return this.index;
    }

    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Float.hashCode(this.index) + C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(C20785Oooo00o.OooO00o(this.color, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(Long.hashCode(this.id) * 31, 31, this.name), 31), 31, this.createdTime), 31, this.modifiedTime);
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setCreatedTime(long j) {
        this.createdTime = j;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setIndex(float f) {
        this.index = f;
    }

    public final void setModifiedTime(long j) {
        this.modifiedTime = j;
    }

    public final void setName(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.name = str;
    }

    public String toString() {
        long j = this.id;
        String str = this.name;
        int i = this.color;
        long j2 = this.createdTime;
        long j3 = this.modifiedTime;
        float f = this.index;
        StringBuilder sb = new StringBuilder("Label(id=");
        sb.append(j);
        sb.append(", name=");
        sb.append(str);
        sb.append(", color=");
        sb.append(i);
        sb.append(", createdTime=");
        sb.append(j2);
        C22205OooOOo.OooO0OO(j3, ", modifiedTime=", ", index=", sb);
        return OooO0OO.OooO0OO(sb, f, ")");
    }

    public /* synthetic */ Label(long j, String str, int i, long j2, long j3, float f, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? 0L : j3, (i2 & 32) != 0 ? 1000.0f : f);
    }

    public Label() {
        this(0L, "", 0, 0L, 0L, 1000.0f);
    }
}
