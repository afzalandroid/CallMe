package com.call.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.call.R;

import com.call.databinding.ActivityRewardBinding;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RewardActivity extends AppCompatActivity {
    ActivityRewardBinding binding;
//    private RewardedAd mRewardedAd;
//    FirebaseDatabase database;
//    String currentUid;
//    int coins= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRewardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        database = FirebaseDatabase.getInstance();
//        currentUid = FirebaseAuth.getInstance().getUid();
//        loadAd();
//
//        database.getReference().child("profiles")
//                .child(currentUid)
//                .child("coins")
//                .addValueEventListener(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(@NonNull DataSnapshot snapshot) {
//                        coins = snapshot.getValue(Integer.class);
//                        binding.coins.setText(String.valueOf(coins));
//                    }
//
//                    @Override
//                    public void onCancelled(@NonNull DatabaseError error) {
//
//                    }
//                });
//
//        binding.video1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (mRewardedAd != null) {
//                    Activity activityContext = RewardActivity.this;
//                    mRewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
//                        @Override
//                        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
//                            loadAd();
//                            coins = coins + 200;
//                            database.getReference().child("profiles")
//                                    .child(currentUid)
//                                    .child("coins")
//                                    .setValue(coins);
//                            binding.video1Icon.setImageResource(R.drawable.check);
//                        }
//                    });
//                } else {
//
//                }
//            }
//        });
//        binding.video2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (mRewardedAd != null) {
//                    Activity activityContext = RewardActivity.this;
//                    mRewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
//                        @Override
//                        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
//                            loadAd();
//                            coins = coins + 300;
//                            database.getReference().child("profiles")
//                                    .child(currentUid)
//                                    .child("coins")
//                                    .setValue(coins);
//                            binding.video2Icon.setImageResource(R.drawable.check);
//                        }
//                    });
//                } else {
//
//                }
//            }
//        });
//        binding.video3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (mRewardedAd != null) {
//                    Activity activityContext = RewardActivity.this;
//                    mRewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
//                        @Override
//                        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
//                            loadAd();
//                            coins = coins + 400;
//                            database.getReference().child("profiles")
//                                    .child(currentUid)
//                                    .child("coins")
//                                    .setValue(coins);
//                            binding.video3Icon.setImageResource(R.drawable.check);
//                        }
//                    });
//                } else {
//
//                }
//            }
//        });
//        binding.video4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (mRewardedAd != null) {
//                    Activity activityContext = RewardActivity.this;
//                    mRewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
//                        @Override
//                        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
//                            loadAd();
//                            coins = coins + 500;
//                            database.getReference().child("profiles")
//                                    .child(currentUid)
//                                    .child("coins")
//                                    .setValue(coins);
//                            binding.video4Icon.setImageResource(R.drawable.check);
//                        }
//                    });
//                } else {
//
//                }
//            }
//        });
//        binding.video5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (mRewardedAd != null) {
//                    Activity activityContext = RewardActivity.this;
//                    mRewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
//                        @Override
//                        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
//                            loadAd();
//                            coins = coins + 1000;
//                            database.getReference().child("profiles")
//                                    .child(currentUid)
//                                    .child("coins")
//                                    .setValue(coins);
//                            binding.video5Icon.setImageResource(R.drawable.check);
//                        }
//                    });
//                } else {
//
//                }
//            }
//        });
//
//
//
//    }
//
//    void loadAd() {
//        AdRequest adRequest = new AdRequest.Builder().build();
//
//        RewardedAd.load(this, "ca-app-pub-5900616063531249/7001767942",
//                adRequest, new RewardedAdLoadCallback() {
//                    @Override
//                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
//                        // Handle the error.
//
//                        mRewardedAd = null;
//                    }
//
//                    @Override
//                    public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
//                        mRewardedAd = rewardedAd;
//                    }
//                });

    }
}