package com.prisar.dalim

import com.google.mlkit.vision.segmentation.Segmentation

class Camera(): ImageSegmentationHelper.SegmentationListener {
    override fun onError(error: String) {
        TODO("Not yet implemented")
    }

    override fun onResults(
        results: List<Segmentation>?,
        inferenceTime: Long,
        imageHeight: Int,
        imageWidth: Int
    ) {
        TODO("Not yet implemented")
    }

}