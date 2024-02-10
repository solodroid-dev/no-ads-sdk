package com.solodroid.ads.sdk.format;

import static com.solodroid.ads.sdk.util.Constant.AD_STATUS_ON;

import android.annotation.SuppressLint;
import android.app.Activity;

import com.solodroid.ads.sdk.util.OnShowAdCompleteListener;

@SuppressLint("StaticFieldLeak")
public class AppOpenAd {
    public static boolean isAppOpenAdLoaded = false;

    public static class Builder {

        private static final String TAG = "AppOpenAd";
        private final Activity activity;
        private String adStatus = "";
        private String adNetwork = "";
        private String backupAdNetwork = "";
        private String adMobAppOpenId = "";
        private String adManagerAppOpenId = "";
        private String applovinAppOpenId = "";
        private String wortiseAppOpenId = "";

        public Builder(Activity activity) {
            this.activity = activity;
        }

        public Builder build() {
            loadAppOpenAd();
            return this;
        }

        public Builder build(OnShowAdCompleteListener onShowAdCompleteListener) {
            loadAppOpenAd(onShowAdCompleteListener);
            return this;
        }

        public Builder show() {
            showAppOpenAd();
            return this;
        }

        public Builder show(OnShowAdCompleteListener onShowAdCompleteListener) {
            showAppOpenAd(onShowAdCompleteListener);
            return this;
        }

        public Builder setAdStatus(String adStatus) {
            this.adStatus = adStatus;
            return this;
        }

        public Builder setAdNetwork(String adNetwork) {
            this.adNetwork = adNetwork;
            return this;
        }

        public Builder setBackupAdNetwork(String backupAdNetwork) {
            this.backupAdNetwork = backupAdNetwork;
            return this;
        }

        public Builder setAdMobAppOpenId(String adMobAppOpenId) {
            this.adMobAppOpenId = adMobAppOpenId;
            return this;
        }

        public Builder setAdManagerAppOpenId(String adManagerAppOpenId) {
            this.adManagerAppOpenId = adManagerAppOpenId;
            return this;
        }

        public Builder setApplovinAppOpenId(String applovinAppOpenId) {
            this.applovinAppOpenId = applovinAppOpenId;
            return this;
        }

        public Builder setWortiseAppOpenId(String wortiseAppOpenId) {
            this.wortiseAppOpenId = wortiseAppOpenId;
            return this;
        }

        public void destroyOpenAd() {
            AppOpenAd.isAppOpenAdLoaded = false;
            if (adStatus.equals(AD_STATUS_ON)) {
            }
        }

        //main ads
        public void loadAppOpenAd(OnShowAdCompleteListener onShowAdCompleteListener) {
            onShowAdCompleteListener.onShowAdComplete();
        }

        public void showAppOpenAd(OnShowAdCompleteListener onShowAdCompleteListener) {
            onShowAdCompleteListener.onShowAdComplete();
        }

        public void loadAppOpenAd() {
        }

        public void showAppOpenAd() {
        }

        //backup ads
        public void loadBackupAppOpenAd(OnShowAdCompleteListener onShowAdCompleteListener) {
            onShowAdCompleteListener.onShowAdComplete();
        }

        public void showBackupAppOpenAd(OnShowAdCompleteListener onShowAdCompleteListener) {
            onShowAdCompleteListener.onShowAdComplete();
        }

        public void loadBackupAppOpenAd() {
        }

        public void showBackupAppOpenAd() {
        }

    }

}
