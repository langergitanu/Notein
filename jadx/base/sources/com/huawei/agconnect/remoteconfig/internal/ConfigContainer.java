package com.huawei.agconnect.remoteconfig.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.remoteconfig.internal.p570a.C17673b;
import com.huawei.agconnect.remoteconfig.internal.p572c.C17681b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class ConfigContainer implements Parcelable {
    public static final Parcelable.Creator<ConfigContainer> CREATOR = new Parcelable.Creator<ConfigContainer>() { // from class: com.huawei.agconnect.remoteconfig.internal.ConfigContainer.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConfigContainer createFromParcel(Parcel parcel) {
            return new ConfigContainer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConfigContainer[] newArray(int i) {
            return new ConfigContainer[i];
        }
    };

    /* JADX INFO: renamed from: a */
    private JSONObject f52261a;

    /* JADX INFO: renamed from: b */
    private List<Map<String, String>> f52262b;

    /* JADX INFO: renamed from: c */
    private String f52263c;

    /* JADX INFO: renamed from: d */
    private long f52264d;

    private ConfigContainer(Parcel parcel) {
        Logger.m75330v("RemoteConfig", "read config container from cache");
        try {
            String string = parcel.readString();
            if (string == null || string.length() <= 0) {
                this.f52261a = new JSONObject();
            } else {
                this.f52261a = new JSONObject(string);
            }
        } catch (JSONException e) {
            Logger.m75328e("RemoteConfig", "parcel json value format error", e);
            this.f52261a = new JSONObject();
        }
        this.f52263c = parcel.readString();
        this.f52264d = parcel.readLong();
        try {
            String string2 = parcel.readString();
            this.f52262b = (string2 == null || string2.length() <= 0) ? new ArrayList<>() : C17681b.m75672a(new JSONArray(string2));
        } catch (JSONException e2) {
            Logger.m75328e("RemoteConfig", "parcel json value format error", e2);
            this.f52262b = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m75653a() {
        return this.f52261a;
    }

    /* JADX INFO: renamed from: b */
    public List<Map<String, String>> m75655b() {
        return this.f52262b;
    }

    /* JADX INFO: renamed from: c */
    public String m75657c() {
        return this.f52263c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f52261a;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        parcel.writeString(jSONObject.toString());
        parcel.writeString(this.f52263c);
        parcel.writeLong(this.f52264d);
        parcel.writeString((this.f52262b != null ? new JSONArray((Collection) this.f52262b) : new JSONArray()).toString());
    }

    /* JADX INFO: renamed from: a */
    public void m75654a(long j) {
        this.f52264d = j;
    }

    /* JADX INFO: renamed from: b */
    public boolean m75656b(long j) {
        return System.currentTimeMillis() - this.f52264d > j * 1000;
    }

    public ConfigContainer(List<C17673b> list, List<Map<String, String>> list2, String str) {
        this.f52261a = C17681b.m75675a(list);
        this.f52262b = list2;
        this.f52263c = str;
        this.f52264d = System.currentTimeMillis();
    }

    public ConfigContainer(JSONObject jSONObject) {
        this.f52261a = jSONObject == null ? new JSONObject() : jSONObject;
    }
}
