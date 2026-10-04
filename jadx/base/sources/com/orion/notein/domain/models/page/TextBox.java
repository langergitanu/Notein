package com.orion.notein.domain.models.page;

import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21036OooOOo0;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.penkit.models.TextBoxInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0oo0O.C31218OooO00o;
import o0oo0O.C31219OooO0O0;
import o0oo0OOo.C31237OooO0O0;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32443OooOOO;
import oO0o0ooO.InterfaceC33908OooO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010\u001eJ\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020&2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u00101\u001a\u0004\u0018\u0001002\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0006¢\u0006\u0004\b3\u00104J\r\u00101\u001a\u000200¢\u0006\u0004\b1\u00105J#\u00108\u001a\b\u0012\u0004\u0012\u00020\n072\u0006\u0010/\u001a\u00020.2\u0006\u00106\u001a\u00020\u0002¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u0010\u001eJ\u0010\u0010;\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b;\u0010\u001eJ\u0010\u0010<\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b<\u0010\u001eJ\u0010\u0010=\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b=\u00104J\u0010\u0010>\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b>\u00104J\u0010\u0010?\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b?\u00104J\u0012\u0010@\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bB\u00104J\u0010\u0010C\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bE\u0010\u001eJ\u0010\u0010F\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bF\u0010 J\u0010\u0010G\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bG\u0010DJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0096\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bL\u0010\u001eJ\u0010\u0010M\u001a\u00020\rHÖ\u0001¢\u0006\u0004\bM\u0010DJ\u001a\u0010P\u001a\u00020\u001a2\b\u0010O\u001a\u0004\u0018\u00010NHÖ\u0003¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010RR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010R\u001a\u0004\bS\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010R\u001a\u0004\bT\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010U\u001a\u0004\bV\u00104R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010U\u001a\u0004\bW\u00104R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010U\u001a\u0004\bX\u00104R*\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010Y\u0012\u0004\b]\u0010^\u001a\u0004\bZ\u0010A\"\u0004\b[\u0010\\R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010U\u001a\u0004\b_\u00104R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010`\u001a\u0004\ba\u0010DR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010RR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010`\u001a\u0004\bc\u0010DR*\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010d\u0012\u0004\bh\u0010^\u001a\u0004\be\u0010I\"\u0004\bf\u0010g¨\u0006i"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/TextBox;", "Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "", "id", "pageId", "text", "", "textSize", "boxWidth", "boxHeight", "Landroid/graphics/RectF;", "bounds", "lineHeight", "", "backgroundColor", "layerId", "", C17625c.f52155b, "defaultTextColor", "Landroid/graphics/Matrix;", "localTransform", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFLandroid/graphics/RectF;FILjava/lang/String;JILandroid/graphics/Matrix;)V", "scale", "getBoundingBox", "(F)Landroid/graphics/RectF;", "", "isRegionLoadable", "()Z", "getLayerId", "()Ljava/lang/String;", "getCreationTime", "()J", "deepCopy", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "getId", "dx", "dy", "LoO00ooO/OooOooO;", "offset", "(FF)V", "r", "Landroid/graphics/PointF;", "center", "rotate", "(FLandroid/graphics/PointF;)V", "Landroid/content/Context;", "context", "Lo0oo0o/OooO0O0;", "toDisplayItem", "(Landroid/content/Context;)Lo0oo0o/OooO0O0;", "getRotationDeg", "()F", "()Lo0oo0o/OooO0O0;", "query", "", "findTextRectListInPageCoordinate", "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "()Landroid/graphics/RectF;", "component8", "component9", "()I", "component10", "component11", "component12", "component13", "()Landroid/graphics/Matrix;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFLandroid/graphics/RectF;FILjava/lang/String;JILandroid/graphics/Matrix;)Lcom/orion/notein/domain/models/page/TextBox;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPageId", "getText", "F", "getTextSize", "getBoxWidth", "getBoxHeight", "Landroid/graphics/RectF;", "getBounds", "setBounds", "(Landroid/graphics/RectF;)V", "getBounds$annotations", "()V", "getLineHeight", "I", "getBackgroundColor", "J", "getDefaultTextColor", "Landroid/graphics/Matrix;", "getLocalTransform", "setLocalTransform", "(Landroid/graphics/Matrix;)V", "getLocalTransform$annotations", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class TextBox implements INoteinDisplayItem {
    private final int backgroundColor;
    private RectF bounds;
    private final float boxHeight;
    private final float boxWidth;
    public final long creationTime;
    private final int defaultTextColor;
    public final String id;
    public final String layerId;
    private final float lineHeight;
    private Matrix localTransform;
    private final String pageId;
    private final String text;
    private final float textSize;

    public TextBox(String id, String pageId, String text, float f, float f2, float f3, RectF rectF, float f4, int i, String layerId, long j, int i2, Matrix matrix) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(layerId, "layerId");
        this.id = id;
        this.pageId = pageId;
        this.text = text;
        this.textSize = f;
        this.boxWidth = f2;
        this.boxHeight = f3;
        this.bounds = rectF;
        this.lineHeight = f4;
        this.backgroundColor = i;
        this.layerId = layerId;
        this.creationTime = j;
        this.defaultTextColor = i2;
        this.localTransform = matrix;
    }

    public static /* synthetic */ TextBox copy$default(TextBox textBox, String str, String str2, String str3, float f, float f2, float f3, RectF rectF, float f4, int i, String str4, long j, int i2, Matrix matrix, int i3, Object obj) {
        return textBox.copy((i3 & 1) != 0 ? textBox.id : str, (i3 & 2) != 0 ? textBox.pageId : str2, (i3 & 4) != 0 ? textBox.text : str3, (i3 & 8) != 0 ? textBox.textSize : f, (i3 & 16) != 0 ? textBox.boxWidth : f2, (i3 & 32) != 0 ? textBox.boxHeight : f3, (i3 & 64) != 0 ? textBox.bounds : rectF, (i3 & 128) != 0 ? textBox.lineHeight : f4, (i3 & 256) != 0 ? textBox.backgroundColor : i, (i3 & 512) != 0 ? textBox.layerId : str4, (i3 & 1024) != 0 ? textBox.creationTime : j, (i3 & 2048) != 0 ? textBox.defaultTextColor : i2, (i3 & 4096) != 0 ? textBox.localTransform : matrix);
    }

    @InterfaceC33908OooO(with = C31219OooO0O0.class)
    public static /* synthetic */ void getBounds$annotations() {
    }

    @InterfaceC33908OooO(with = C31218OooO00o.class)
    public static /* synthetic */ void getLocalTransform$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLayerId() {
        return this.layerId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getDefaultTextColor() {
        return this.defaultTextColor;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Matrix getLocalTransform() {
        return this.localTransform;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getTextSize() {
        return this.textSize;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getBoxWidth() {
        return this.boxWidth;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getBoxHeight() {
        return this.boxHeight;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final RectF getBounds() {
        return this.bounds;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getLineHeight() {
        return this.lineHeight;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final TextBox copy(String id, String pageId, String text, float textSize, float boxWidth, float boxHeight, RectF bounds, float lineHeight, int backgroundColor, String layerId, long creationTime, int defaultTextColor, Matrix localTransform) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(layerId, "layerId");
        return new TextBox(id, pageId, text, textSize, boxWidth, boxHeight, bounds, lineHeight, backgroundColor, layerId, creationTime, defaultTextColor, localTransform);
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public INoteinDisplayItem deepCopy(String id, String layerId, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        return copy$default(this, id, null, null, 0.0f, 0.0f, 0.0f, new RectF(this.bounds), 0.0f, 0, layerId, creationTime, 0, null, 6590, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextBox)) {
            return false;
        }
        TextBox textBox = (TextBox) other;
        return OooOOO0.OooO0O0(this.id, textBox.id) && OooOOO0.OooO0O0(this.pageId, textBox.pageId) && OooOOO0.OooO0O0(this.text, textBox.text) && Float.compare(this.textSize, textBox.textSize) == 0 && Float.compare(this.boxWidth, textBox.boxWidth) == 0 && Float.compare(this.boxHeight, textBox.boxHeight) == 0 && OooOOO0.OooO0O0(this.bounds, textBox.bounds) && Float.compare(this.lineHeight, textBox.lineHeight) == 0 && this.backgroundColor == textBox.backgroundColor && OooOOO0.OooO0O0(this.layerId, textBox.layerId) && this.creationTime == textBox.creationTime && this.defaultTextColor == textBox.defaultTextColor && OooOOO0.OooO0O0(this.localTransform, textBox.localTransform);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<android.graphics.RectF>, oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<android.graphics.RectF>] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    public final List<RectF> findTextRectListInPageCoordinate(Context context, String query) {
        ?? arrayList;
        RectF rectF;
        char cCharAt;
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(query, "query");
        InterfaceC31284OooO0O0 displayItem = toDisplayItem(context);
        TextBoxInfo textBoxInfo = displayItem instanceof TextBoxInfo ? (TextBoxInfo) displayItem : null;
        ?? arrayList2 = C34434OooOoO.f123453OooOo0o;
        if (textBoxInfo == null) {
            return arrayList2;
        }
        RectF boundingBox = textBoxInfo.getBoundingBox(1.0f);
        float f = boundingBox.left;
        float f2 = boundingBox.top;
        C31237OooO0O0.f111407OooO0O0.getClass();
        CharSequence charSequenceOooO0Oo = C31237OooO0O0.OooO0Oo(context, textBoxInfo);
        int i = 0;
        if (charSequenceOooO0Oo == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TextBoxRender");
            c20358OooO00o.OooO0OO(OooO00o.OooO00o("Unable to get the spannable string from TextBoxInfo. ", textBoxInfo.getText()), new Object[0]);
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(textBoxInfo.getTextSize());
            StaticLayout staticLayoutOooO0OO = C31237OooO0O0.OooO0OO(context, charSequenceOooO0Oo, (int) textBoxInfo.getBoxWidth(), textBoxInfo.getLineHeight(), textPaint);
            String string = staticLayoutOooO0OO.getText().toString();
            Locale ROOT = Locale.ROOT;
            OooOOO0.OooO0o(ROOT, "ROOT");
            String lowerCase = string.toLowerCase(ROOT);
            OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
            String lowerCase2 = query.toLowerCase(ROOT);
            OooOOO0.OooO0o(lowerCase2, "toLowerCase(...)");
            if (lowerCase2.length() != 0 && lowerCase2.length() <= lowerCase.length()) {
                int[] iArr = new int[lowerCase2.length() + 1];
                int length = lowerCase2.length();
                int i2 = 1;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    int i4 = iArr[i3];
                    while (i4 > 0 && lowerCase2.charAt(i4) != lowerCase2.charAt(i2)) {
                        i4 = iArr[i4];
                    }
                    if (i4 > 0 || lowerCase2.charAt(i4) == lowerCase2.charAt(i2)) {
                        iArr[i3] = i4 + 1;
                    }
                    i2 = i3;
                }
                arrayList = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int i5 = 0;
                while (i < lowerCase.length()) {
                    if (lowerCase.charAt(i) == 65279 || (8203 <= (cCharAt = lowerCase.charAt(i)) && cCharAt < 8206)) {
                        i++;
                    } else {
                        if (arrayList3.isEmpty() || ((Number) OooOo.OoooOOo(arrayList3)).intValue() != i) {
                            arrayList3.add(Integer.valueOf(i));
                        }
                        if (i5 < lowerCase2.length() && lowerCase.charAt(i) == lowerCase2.charAt(i5)) {
                            i5++;
                            if (i5 == lowerCase2.length()) {
                                arrayList.add(new C32443OooOOO(Integer.valueOf(((Number) C21505OooO0Oo.OooO00o(i5, arrayList3)).intValue()), Integer.valueOf(i)));
                            }
                        } else if (i5 > 0) {
                            i5 = iArr[i5];
                            i--;
                        }
                        i++;
                    }
                }
            } else {
                arrayList = arrayList2;
            }
            if (!arrayList.isEmpty()) {
                arrayList2 = new ArrayList();
                for (C32443OooOOO c32443OooOOO : (Iterable) arrayList) {
                    int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                    int iIntValue2 = ((Number) c32443OooOOO.f116637OooOo).intValue();
                    int lineForOffset = staticLayoutOooO0OO.getLineForOffset(iIntValue);
                    int lineForOffset2 = staticLayoutOooO0OO.getLineForOffset(iIntValue2);
                    if (lineForOffset == lineForOffset2) {
                        int i6 = iIntValue2 + 1;
                        arrayList2.add(new RectF(staticLayoutOooO0OO.getPrimaryHorizontal(iIntValue), staticLayoutOooO0OO.getLineTop(lineForOffset), (i6 >= staticLayoutOooO0OO.getText().length() || staticLayoutOooO0OO.getLineForOffset(i6) != lineForOffset) ? staticLayoutOooO0OO.getLineRight(lineForOffset) : staticLayoutOooO0OO.getPrimaryHorizontal(i6), staticLayoutOooO0OO.getLineBottom(lineForOffset)));
                    } else if (lineForOffset <= lineForOffset2) {
                        int i7 = lineForOffset;
                        while (true) {
                            if (i7 == lineForOffset) {
                                rectF = new RectF(staticLayoutOooO0OO.getPrimaryHorizontal(iIntValue), staticLayoutOooO0OO.getLineTop(i7), staticLayoutOooO0OO.getLineRight(i7), staticLayoutOooO0OO.getLineBottom(i7));
                            } else if (i7 == lineForOffset2) {
                                int i8 = iIntValue2 + 1;
                                rectF = new RectF(staticLayoutOooO0OO.getLineLeft(i7), staticLayoutOooO0OO.getLineTop(i7), (i8 >= staticLayoutOooO0OO.getText().length() || staticLayoutOooO0OO.getLineForOffset(i8) != lineForOffset2) ? staticLayoutOooO0OO.getLineRight(i7) : staticLayoutOooO0OO.getPrimaryHorizontal(i8), staticLayoutOooO0OO.getLineBottom(i7));
                            } else {
                                rectF = new RectF(staticLayoutOooO0OO.getLineLeft(i7), staticLayoutOooO0OO.getLineTop(i7), staticLayoutOooO0OO.getLineRight(i7), staticLayoutOooO0OO.getLineBottom(i7));
                            }
                            arrayList2.add(rectF);
                            if (i7 != lineForOffset2) {
                                i7++;
                            }
                        }
                    }
                }
            }
        }
        Iterator it = ((Iterable) arrayList2).iterator();
        while (it.hasNext()) {
            ((RectF) it.next()).offset(f, f2);
        }
        return arrayList2;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public RectF getBoundingBox(float scale) {
        RectF rectF = this.bounds;
        return rectF == null ? new RectF() : new RectF(rectF);
    }

    public final RectF getBounds() {
        return this.bounds;
    }

    public final float getBoxHeight() {
        return this.boxHeight;
    }

    public final float getBoxWidth() {
        return this.boxWidth;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public long getCreationTime() {
        return this.creationTime;
    }

    public final int getDefaultTextColor() {
        return this.defaultTextColor;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public String getId() {
        return this.id;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public String getLayerId() {
        return this.layerId;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final Matrix getLocalTransform() {
        return this.localTransform;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final float getRotationDeg() {
        Matrix matrix = this.localTransform;
        if (matrix == null || matrix.isIdentity()) {
            return 0.0f;
        }
        matrix.getValues(new float[9]);
        return (float) Math.toDegrees(Math.atan2(r1[3], r1[0]));
    }

    public final String getText() {
        return this.text;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    public int hashCode() {
        int iOooO0OO = C20509OooO0oo.OooO0OO(this.boxHeight, C20509OooO0oo.OooO0OO(this.boxWidth, C20509OooO0oo.OooO0OO(this.textSize, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.pageId), 31, this.text), 31), 31), 31);
        RectF rectF = this.bounds;
        int iOooO00o = C20785Oooo00o.OooO00o(this.defaultTextColor, C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.backgroundColor, C20509OooO0oo.OooO0OO(this.lineHeight, (iOooO0OO + (rectF == null ? 0 : rectF.hashCode())) * 31, 31), 31), 31, this.layerId), 31, this.creationTime), 31);
        Matrix matrix = this.localTransform;
        return iOooO00o + (matrix != null ? matrix.hashCode() : 0);
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public boolean isRegionLoadable() {
        return true;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public void offset(float dx, float dy) {
        RectF rectF = this.bounds;
        if (rectF != null) {
            rectF.offset(dx, dy);
        }
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public void rotate(float r, PointF center) {
        OooOOO0.OooO0oO(center, "center");
        if (this.localTransform == null) {
            this.localTransform = new Matrix();
        }
        Matrix matrix = this.localTransform;
        if (matrix != null) {
            matrix.postRotate(r, 0.0f, 0.0f);
        }
    }

    public final void setBounds(RectF rectF) {
        this.bounds = rectF;
    }

    public final void setLocalTransform(Matrix matrix) {
        this.localTransform = matrix;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public InterfaceC31284OooO0O0 toDisplayItem(Context context) {
        OooOOO0.OooO0oO(context, "context");
        return toDisplayItem();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.pageId;
        String str3 = this.text;
        float f = this.textSize;
        float f2 = this.boxWidth;
        float f3 = this.boxHeight;
        RectF rectF = this.bounds;
        float f4 = this.lineHeight;
        int i = this.backgroundColor;
        String str4 = this.layerId;
        long j = this.creationTime;
        int i2 = this.defaultTextColor;
        Matrix matrix = this.localTransform;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("TextBox(id=", str, ", pageId=", str2, ", text=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", textSize=");
        sbOooO0O0.append(f);
        sbOooO0O0.append(", boxWidth=");
        sbOooO0O0.append(f2);
        sbOooO0O0.append(", boxHeight=");
        sbOooO0O0.append(f3);
        sbOooO0O0.append(", bounds=");
        sbOooO0O0.append(rectF);
        sbOooO0O0.append(", lineHeight=");
        sbOooO0O0.append(f4);
        sbOooO0O0.append(", backgroundColor=");
        C21036OooOOo0.OooO0Oo(i, ", layerId=", str4, ", creationTime=", sbOooO0O0);
        sbOooO0O0.append(j);
        sbOooO0O0.append(", defaultTextColor=");
        sbOooO0O0.append(i2);
        sbOooO0O0.append(", localTransform=");
        sbOooO0O0.append(matrix);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public final InterfaceC31284OooO0O0 toDisplayItem() {
        String str = this.id;
        String str2 = this.text;
        float f = this.textSize;
        float f2 = this.boxWidth;
        float f3 = this.boxHeight;
        RectF rectF = new RectF(this.bounds);
        float f4 = this.lineHeight;
        int i = this.backgroundColor;
        String str3 = this.layerId;
        long j = this.creationTime;
        int i2 = this.defaultTextColor;
        Matrix matrix = this.localTransform;
        if (matrix == null) {
            matrix = new Matrix();
        }
        return new TextBoxInfo(str, str2, f, f2, f3, rectF, f4, i, str3, j, i2, matrix);
    }

    public /* synthetic */ TextBox(String str, String str2, String str3, float f, float f2, float f3, RectF rectF, float f4, int i, String str4, long j, int i2, Matrix matrix, int i3, C24018OooO0oo c24018OooO0oo) {
        this((i3 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, str3, f, f2, f3, (i3 & 64) != 0 ? null : rectF, f4, (i3 & 256) != 0 ? 0 : i, str4, j, (i3 & 2048) != 0 ? -16777216 : i2, matrix);
    }
}
