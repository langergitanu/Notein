package com.orion.notein.domain.models.page;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import com.huawei.agconnect.credential.obs.C17625c;
import kotlin.Metadata;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\rH&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH&¢\u0006\u0004\b\u0015\u0010\fJ\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b#\u0010$ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "", "", "scale", "Landroid/graphics/RectF;", "getBoundingBox", "(F)Landroid/graphics/RectF;", "", "isRegionLoadable", "()Z", "", "getLayerId", "()Ljava/lang/String;", "", "getCreationTime", "()J", "id", "layerId", C17625c.f52155b, "deepCopy", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "getId", "dx", "dy", "LoO00ooO/OooOooO;", "offset", "(FF)V", "r", "Landroid/graphics/PointF;", "center", "rotate", "(FLandroid/graphics/PointF;)V", "Landroid/content/Context;", "context", "Lo0oo0o/OooO0O0;", "toDisplayItem", "(Landroid/content/Context;)Lo0oo0o/OooO0O0;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface INoteinDisplayItem {
    INoteinDisplayItem deepCopy(String id, String layerId, long creationTime);

    RectF getBoundingBox(float scale);

    long getCreationTime();

    String getId();

    String getLayerId();

    boolean isRegionLoadable();

    void offset(float dx, float dy);

    void rotate(float r, PointF center);

    InterfaceC31284OooO0O0 toDisplayItem(Context context);
}
