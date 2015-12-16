/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

var moment = require('moment');

/**
 * @class
 * Initializes a new instance of the DurationWrapper class.
 * @constructor
 * @member {moment.duration} [field]
 * 
 */
function DurationWrapper(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.field !== undefined) {
      this.field = parameters.field;
    }
  }    
}


/**
 * Validate the payload against the DurationWrapper schema
 *
 * @param {JSON} payload
 *
 */
DurationWrapper.prototype.serialize = function () {
  var payload = {};
  if (this['field']) {
    if (!moment.isDuration(this['field'])) {
      throw new Error('this[\'field\'] must be of type moment.duration.');
    }
    payload['field'] = this['field'].toISOString();
  }

  return payload;
};

/**
 * Deserialize the instance to DurationWrapper schema
 *
 * @param {JSON} instance
 *
 */
DurationWrapper.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance['field']) {
      this['field'] = moment.duration(instance['field']);
    }
    else if (instance['field'] !== undefined) {
      this['field'] = instance['field'];
    }
  }

  return this;
};

module.exports = DurationWrapper;