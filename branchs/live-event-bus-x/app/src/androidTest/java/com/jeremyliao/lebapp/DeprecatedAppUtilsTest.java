package com.jeremyliao.lebapp;


import androidx.test.runner.AndroidJUnit4;

import com.jeremyliao.liveeventbus.utils.DeprecatedAppUtils;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by liaohailiang on 2019/3/20.
 */
@RunWith(AndroidJUnit4.class)
public class DeprecatedAppUtilsTest {

    @Test
    public void testGetApplicationContext() throws Exception {
        Assert.assertNotNull(DeprecatedAppUtils.getApp());
    }
}